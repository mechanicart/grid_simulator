import React from 'react';
import Lodash from 'lodash';
import {
	DiagramWidget,
	DiagramEngine,
	DefaultNodeFactory,
	DefaultLinkFactory,
	DiagramModel,
	DefaultNodeModel,
	DefaultPortModel,
    LinkModel,
} from 'storm-react-diagrams';
import { 
    Button
 } from '@material-ui/core';
import './srd.css';
import ConstructorAreaDnd from './ConstructorAreaDnd'

class ConstrucrotArea extends React.Component {
	componentWillMount() {
		this.engine = new DiagramEngine();

		this.engine.registerNodeFactory(new DefaultNodeFactory());
		this.engine.registerLinkFactory(new DefaultLinkFactory());

		this.model = new DiagramModel();

		const node1 = new DefaultNodeModel('Node 1', 'rgb(0,192,255)');
		const port1 = node1.addPort(new DefaultPortModel(false, 'out-1', 'Out'));
		node1.x = 100;
		node1.y = 100;

		const node2 = new DefaultNodeModel('Node 2', 'rgb(192,255,0)');
		const port2 = node2.addPort(new DefaultPortModel(true, 'in-1', 'In'));
		node2.x = 400;
		node2.y = 100;

		const link1 = new LinkModel();
		link1.setSourcePort(port1);
        link1.setTargetPort(port2);

		this.model.addNode(node1);
		this.model.addNode(node2);
		this.model.addLink(link1);

        // custom model
        
        // Set the grid size HERE!
		// this.model.setGridSize(50);
        
        // Set zoom
        this.model.zoom = 165

		this.engine.setDiagramModel(this.model);
    }
    
    hadleSerilize = () => {
        const str = JSON.stringify(this.model.serializeDiagram());
        console.log(this.model.serializeDiagram())
    }

	render() {
		return (
			<div>
                <Button color="inherit" onClick={this.hadleSerilize}>serialize</Button>
                <ConstructorAreaDnd model={{ type: 'out' }} name="Out Node" backgroundColor="hotpink" />
                <div
					className="diagram-layer"
					onDrop={event => {
						var data = JSON.parse(event.dataTransfer.getData('storm-diagram-node'));
						var nodesCount = Lodash.keys(this.engine.getDiagramModel().getNodes()).length;
						var node = null;
						if (data.type === 'in') {
							node = new DefaultNodeModel('Node ' + (nodesCount + 1), 'peru');
							node.addPort(new DefaultPortModel(true, 'in-1', 'In'));
						} else {
							node = new DefaultNodeModel('Node ' + (nodesCount + 1), 'hotpink');
							node.addPort(new DefaultPortModel(false, 'out-1', 'Out'));
						}
						var points = this.engine.getRelativeMousePoint(event);
						node.x = points.x;
						node.y = points.y;
						this.engine.getDiagramModel().addNode(node);
						this.forceUpdate();
					}}
					onDragOver={event => {
						event.preventDefault();
					}}
				>
				    <DiagramWidget diagramEngine={this.engine} />
                </div>
			</div>
		);
	}
}

export default ConstrucrotArea
