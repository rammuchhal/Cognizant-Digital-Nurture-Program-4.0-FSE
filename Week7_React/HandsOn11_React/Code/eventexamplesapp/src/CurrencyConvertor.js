import React, { useState } from 'react';

function CurrencyConvertor() {
    const [rupees, setRupees] = useState(0);
    const [euros, setEuros] = useState(0);

    // Handles changes to the input field
    const handleChange = (event) => {
        setRupees(event.target.value);
    };

    // Handles the form submission and conversion
    const handleSubmit = (event) => {
        event.preventDefault(); // Prevents the page from reloading
        const convertedAmount = rupees / 90; // Assuming 1 Euro = 90 INR
        setEuros(convertedAmount.toFixed(2)); // Set the converted amount, rounded to 2 decimal places
        alert(`Converting to Euro: Amount is ${convertedAmount.toFixed(2)}`);
    };

    return (
        <div className="component">
            <h2>Currency Convertor!!!</h2>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>Amount: </label>
                    <input type="number" value={rupees} onChange={handleChange} />
                </div>
                <div>
                    <label>Currency: </label>
                    <input type="text" value={euros > 0 ? `${euros} Euro` : ''} readOnly />
                </div>
                <button type="submit">Submit</button>
            </form>
        </div>
    );
}

export default CurrencyConvertor;
