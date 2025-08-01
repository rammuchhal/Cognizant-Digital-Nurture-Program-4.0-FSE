import React, { useState } from 'react';

// This component demonstrates different ways to conditionally render content.
function ConditionalExamples() {
    const [isLoggedIn, setIsLoggedIn] = useState(true);
    const [view, setView] = useState('dashboard'); // Can be 'dashboard', 'profile', 'settings'
    const unreadMessages = ['Hello!', 'React is great.'];

    // 1. Using if/else
    let authButton;
    if (isLoggedIn) {
        authButton = <button onClick={() => setIsLoggedIn(false)}>Logout</button>;
    } else {
        authButton = <button onClick={() => setIsLoggedIn(true)}>Login</button>;
    }

    // A component to demonstrate the switch statement
    const MainView = () => {
        switch (view) {
            case 'profile':
                return <p>Showing user profile.</p>;
            case 'settings':
                return <p>Showing user settings.</p>;
            default:
                return <p>Showing the dashboard.</p>;
        }
    };

    return (
        <div className="examples-container">
            <h2>Conditional Rendering Examples</h2>

            <h4>1. If/Else Statement</h4>
            {authButton}

            <hr />

            <h4>2. Ternary Operator</h4>
            <p>
                User is currently: <strong>{isLoggedIn ? 'Logged In' : 'Logged Out'}</strong>
            </p>

            <hr />

            <h4>3. Logical && Operator (Short-circuit)</h4>
            {unreadMessages.length > 0 && (
                <p>You have {unreadMessages.length} unread messages.</p>
            )}

            <hr />

            <h4>4. Switch Statement (or equivalent)</h4>
            <div>
                <button onClick={() => setView('dashboard')}>Dashboard</button>
                <button onClick={() => setView('profile')}>Profile</button>
                <button onClick={() => setView('settings')}>Settings</button>
                <div className="view-box">
                    <MainView />
                </div>
            </div>
        </div>
    );
}

export default ConditionalExamples;
