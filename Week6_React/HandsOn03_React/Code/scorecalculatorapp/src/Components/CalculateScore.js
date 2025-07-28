import '../Stylesheets/mystyle.css';

// Fixed this function to correctly format the decimal
const formatDecimal = (decimal) => {
    return decimal.toFixed(2);
}

const calcScore = (total, goal) => {
    // Note: The logic here is unusual. If total=284 and goal=3, this will be a large number.
    // If the goal was to calculate a percentage, it would be (total / goal) * 100.
    // For now, we are keeping the original logic.
    return formatDecimal(total / goal);
}

export const CalculateScore = ({ Name, School, total, goal }) => {
    // ✅ Add the 'return' statement here
    return (
        <div className="formatstyle">
            {/* ✅ Correctly styled the h1 tag */}
            <h1 style={{ color: 'brown' }}> Student Details: </h1>

            <div className="Name">
                <span> Name: </span>
                <span> {Name} </span>
            </div>

            <div className="School">
                <span> School: </span>
                <span> {School} </span>
            </div>

            <div className="Total">
                <span> Total: </span>
                <span> {total} </span> Marks
            </div>

            <div className="Score">
                <span> Score: </span>
                <span>
                    {
                        calcScore(
                            total,
                            goal
                        )
                    }
                </span>
            </div>
        </div>
    );
}