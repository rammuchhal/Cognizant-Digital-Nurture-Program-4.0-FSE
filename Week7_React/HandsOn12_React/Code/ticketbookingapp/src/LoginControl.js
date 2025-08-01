import React, { Component } from 'react';

// Component for the logged-in user's view
function UserGreeting(props) {
    return (
        <div>
            <h1>Welcome back</h1>
            <p>You can now book your tickets.</p>
        </div>
    );
}

// Component for the guest user's view
function GuestGreeting(props) {
    return (
        <div>
            <h1>Please sign up.</h1>
            <p>Browse flight details below.</p>
        </div>
    );
}

// Component that decides which greeting to show
function Greeting(props) {
    const isLoggedIn = props.isLoggedIn;
    if (isLoggedIn) {
        return <UserGreeting />;
    }
    return <GuestGreeting />;
}

// Login Button Component
function LoginButton(props) {
    return (
        <button onClick={props.onClick}>
            Login
        </button>
    );
}

// Logout Button Component
function LogoutButton(props) {
    return (
        <button onClick={props.onClick}>
            Logout
        </button>
    );
}


// This is the main controlling component
class LoginControl extends Component {
    constructor(props) {
        super(props);
        this.handleLoginClick = this.handleLoginClick.bind(this);
        this.handleLogoutClick = this.handleLogoutClick.bind(this);
        this.state = { isLoggedIn: false };
    }

    handleLoginClick() {
        this.setState({ isLoggedIn: true });
    }

    handleLogoutClick() {
        this.setState({ isLoggedIn: false });
    }

    render() {
        const isLoggedIn = this.state.isLoggedIn;
        let button;

        // Conditionally render the correct button
        if (isLoggedIn) {
            button = <LogoutButton onClick={this.handleLogoutClick} />;
        } else {
            button = <LoginButton onClick={this.handleLoginClick} />;
        }

        return (
            <div>
                {/* Render the appropriate greeting and button */}
                <Greeting isLoggedIn={isLoggedIn} />
                {button}
            </div>
        );
    }
}

export default LoginControl;
