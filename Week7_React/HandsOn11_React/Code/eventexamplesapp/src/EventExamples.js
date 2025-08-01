import React, { useState } from 'react';

function EventExamples() {
    // 1. State for the counter
    const [count, setCount] = useState(5); // Initialized to 5 as per screenshot

    const increment = () => {
        setCount(prevCount => prevCount + 1);
    };


    const decrement = () => {
        setCount(prevCount => prevCount - 1);
    };


    const sayHello = () => {
        alert('Hello Member!');
    };

    // Handler that calls multiple methods
    const handleIncrement = () => {
        increment();
        sayHello();
    };


    const sayMessage = (message) => {
        alert(message);
    };


    const onPress = () => {
        alert('I was clicked');
    };

    return (
        <div className="component">
            <h2>Counter and Event Examples</h2>
            <h3>{count}</h3>
            <div>
                <button onClick={handleIncrement}>Increment</button>
                <button onClick={decrement}>Decrement</button>
                <button onClick={() => sayMessage('welcome')}>Say Welcome</button>
                <button onClick={onPress}>Click on me</button>
            </div>
        </div>
    );
}

export default EventExamples;
