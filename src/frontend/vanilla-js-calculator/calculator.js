// creating calculator capabilities via OOP.
class Calculator {
    constructor(displayElement) {
        this.displayElement = displayElement;
        this.currentOperand = '0';
        this.previousOperand = '';
        this.operator = null;
        this.shouldResetDisplay = false;
    }

    clear() {
        this.currentOperand = '0';
        this.previousOperand = '';
        this.operator = null;
        this.shouldResetDisplay = false;
    }

    delete() {
        if (this.currentOperand.length === 1) {
            this.currentOperand = '0';
        } 
        
        else {
            this.currentOperand = this.currentOperand.slice(0, -1);
        }
    }

    appendNumber(number) {
        if (number === '.' && this.currentOperand.includes('.')) return;
        
        if (this.shouldResetDisplay) {
            this.currentOperand = number === '.' ? '0.' : number;
            this.shouldResetDisplay = false;
            return;
        }

        if (this.currentOperand === '0' && number !== '.') {
            this.currentOperand = number;
        } 
        
        else {
            this.currentOperand += number;
        }
    }

    chooseOperation(operator) {
        if (this.currentOperand === '') return;
        
        if (this.previousOperand !== '') {
            this.calculate();
        }

        this.operator = operator;
        this.previousOperand = this.currentOperand;
        this.shouldResetDisplay = true;
    }

    calculate() {
        let result;
        const prev = parseFloat(this.previousOperand);
        const current = parseFloat(this.currentOperand);

        if (isNaN(prev) || isNaN(current)) 
            return;

        switch (this.operator) {
            case '+':
                result = this.add(prev, current);
                break;

            case '-':
                result = this.subtract(prev, current);
                break;

            case '*':
                result = this.multiply(prev, current);
                break;

            case '/':
                result = this.divide(prev, current);
                break;

            default:
                return;
        }

        this.currentOperand = result.toString();
        this.operator = null;
        this.previousOperand = '';
        this.shouldResetDisplay = true;
    }

    add(a, b) {
        return a + b;
    }

    subtract(a, b) {
        return a - b;
    }

    multiply(a, b) {
        return a * b;
    }

    divide(a, b) {
        if (b === 0) {
            alert('Cannot divide by zero!');
            return 0;
        }
        return a / b;
    }

    updateDisplay() {
        this.displayElement.textContent = this.currentOperand;
    }
}


document.addEventListener('DOMContentLoaded', () => {
    const displayElement = document.getElementById('display');
    const calculator = new Calculator(displayElement);

    const numberButtons = document.querySelectorAll('[data-number]');
    const operatorButtons = document.querySelectorAll('[data-operator]');
    const equalsButton = document.querySelector('[data-action="equals"]');
    const clearButton = document.querySelector('[data-action="clear"]');
    const deleteButton = document.querySelector('[data-action="delete"]');

    numberButtons.forEach(button => {
        button.addEventListener('click', () => {
            calculator.appendNumber(button.dataset.number);
            calculator.updateDisplay();
        });
    });

    operatorButtons.forEach(button => {
        button.addEventListener('click', () => {
            calculator.chooseOperation(button.dataset.operator);
            calculator.updateDisplay();
        });
    });

    equalsButton.addEventListener('click', () => {
        calculator.calculate();
        calculator.updateDisplay();
    });

    clearButton.addEventListener('click', () => {
        calculator.clear();
        calculator.updateDisplay();
    });

    deleteButton.addEventListener('click', () => {
        calculator.delete();
        calculator.updateDisplay();
    });

    document.addEventListener('keydown', (e) => {
        if (e.key >= '0' && e.key <= '9' || e.key === '.') {
            calculator.appendNumber(e.key);
            calculator.updateDisplay();
        } else if (e.key === '+' || e.key === '-' || e.key === '*' || e.key === '/') {
            calculator.chooseOperation(e.key);
            calculator.updateDisplay();
        } else if (e.key === 'Enter' || e.key === '=') {
            calculator.calculate();
            calculator.updateDisplay();
        } else if (e.key === 'Escape') {
            calculator.clear();
            calculator.updateDisplay();
        } else if (e.key === 'Backspace') {
            calculator.delete();
            calculator.updateDisplay();
        }
    });
});