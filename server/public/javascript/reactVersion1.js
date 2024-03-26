console.log("Running React ");

class Hello extends React.Component {
    render() {
        return <div>Hello {this.props.toWhat}</div>;
    }
}

ReactDOM.render(
    <Hello toWhat="world" />,
    document.getElementById('root')
)