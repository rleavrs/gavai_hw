package controllers.depthfirst;

import core.game.Observation;
import core.game.StateObservation;
import core.player.AbstractPlayer;
import ontology.Types;
import tools.ElapsedCpuTimer;

import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;


public class Agent extends AbstractPlayer {

    protected ArrayList<Observation> grid[][];

    protected int block_size;


    public Agent(StateObservation so, ElapsedCpuTimer elapsedTimer) {
        grid = so.getObservationGrid();
        block_size = so.getBlockSize();

        System.out.println("wocao");
        for(Observation i : grid[0][0]){
            System.out.println(Double.toString(i.position.x) + " " + Double.toString(i.position.y));

        }
    }

    public Types.ACTIONS act(StateObservation stateObs, ElapsedCpuTimer elapsedTimer) {

        // get basic infomation of game
        ArrayList<Observation>[] npcPositions = stateObs.getNPCPositions();
        ArrayList<Observation>[] fixedPositions = stateObs.getImmovablePositions();
        ArrayList<Observation>[] movingPositions = stateObs.getMovablePositions();
        ArrayList<Observation>[] resourcesPositions = stateObs.getResourcesPositions();
        ArrayList<Observation>[] portalPositions = stateObs.getPortalsPositions();
        grid = stateObs.getObservationGrid();


        System.out.println("this is debug!!!");
        System.out.println(npcPositions.length);

        return null;
    }
}

