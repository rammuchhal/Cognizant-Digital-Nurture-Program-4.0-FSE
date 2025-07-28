import React, { Component } from 'react';

class CountPeople extends Component {
    // Use the constructor to initialize the component's state
    constructor(props) {
        super(props);
        this.state = {
            entrycount: 0,
            exitcount: 0,
        };
    }

    // Method to update the entry count
    // This uses the functional form of setState, which is best for state updates that rely on previous state
    updateEntry = () => {
        this.setState((prevState) => ({
            entrycount: prevState.entrycount + 1,
        }));
    };

    // Method to update the exit count
    updateExit = () => {
        this.setState((prevState) => ({
            exitcount: prevState.exitcount + 1,
        }));
    };

    render() {
        return (
            <div className="counter-container">
                {/* The Login button calls updateEntry when clicked */}
                <button className="btn btn-login" onClick={this.updateEntry}>
                    Login
                </button>
                <span>{this.state.entrycount} People Entered!!</span>

                {/* The Exit button calls updateExit when clicked */}
                <button className="btn btn-exit" onClick={this.updateExit}>
                    Exit
                </button>
                <span>{this.state.exitcount} People Left!!</span>
            </div>
        );
    }
}

export default CountPeople;
