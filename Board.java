/**
 *	Board is the board which you play the game Network on.
 *	Instance variables:
 * 		-	blackNetwork is a Network class which contains the network for player black
 *		-	whiteNetwork is a Network class which contains the network for player white
 *		- 	width is the width of 'this' board 
 *		-	height is the height of 'this' board
 */

public class Board {
	protected Network blackNetwork;
	protected Network whiteNetwork;
	protected int width;
	protected int height;

	public Board(int height, int width);

	/**
	 * getHeight() returns the height of 'this' board
	 * @returns the width of Board (this invariant must be 8).
	 */
	public int getHeight();

	/**
	 * getWidth() returns the width of 'this' board
	 * @returns the width of Board (this invariant must be 8).
	 */
	public int getWidth();

	/**
	 *	isValidPosition(int x, int y) returns whether or not a specified position is valid. 
	 *            Corner pieces are invalid, as well as any coordinates specifying a nonexistent part of an array.
	 *	@returns true if a valid position is give, and false otherwise.
	 */
	public boolean isValidPosition(Coordinate location);
	/////// you can do this or throw exception- your choice.

	/**
	 * GetNetwork gets the corresponding player's, specificed as color, network
	 * @param color is the owner of the network you want to retrieve
	 * @return requested network
	 */
	public Network getNetwork(int color);

	/**
	 *	hasNetwork checks if any of the Networks have been completed,
	 *	@return WHITE if white's Network is completed, BLACK if black's Network is completed, -1 when neither.
	 */
	public int hasNetwork();

	/**
	 * getPiece retrieves the piece located at the specified location
	 * @param location is the location you wish to retrieve the piece from
	 * @return requested piece in the location
	 */
	public Piece getPiece(Coordinate location) throws inValidLocationException;

	/**
	 *	piecesRemaining(int color) returns whether or not MachinePlayer "p" has more pieces to use. 
	 *			This is necessary for determining whether a step or add move should be put to action.
	 *	@param	p is the specified player under consideration
	 *	@return true if p has more pieces to use, false otherwise.
	 */
	public boolean piecesRemaining(int color);
	/**
	 * getSurroundings(Piece p) returns the surroundings Pieces (if any) of Piece "p".
	 * @param "p" is the Piece under consideration.
	 * @returns a DList of surrounding Pieces (this may be modified to be an array instead).
	 */	
	public DList getSurroundings(Piece p);

	/** 
	 *	addPiece(int x, int y) adds a piece to the specified x and y coordinates.
	 *	Location should be within the board boundary. Throw an exception if it is not.
	 *	@param location is the location of the piece you wish to add.
	 */
	public void addPiece(Coordinate location) throws inValidLocationException;

	/**
	 *	removePiece(int x, int y) removes a piece in the specified x and y coordinates
	 *  Location should be within the board boundary. Throw an exception if it is not.
	 *	@param location is the location of the piece you wish to remove.
	 */
	public void removePiece(Coordinate location) throws inValidLocationException;
    
    /** 
     *	doAction(Move m, int color) initializes a move based on whether or not it is valid. 
     *           This is dependent on the kind of move "m" is, as well as the color given.
     *	@param m is the Move played
     *	@param color represents the side from which the move was made.
     */
    public void doAction(Move m, int color);

    /** 
     *	undoAction(Move m, int color) undoes a previously made move based on whether or not it is valid. 
     *			 This is dependent again on the kind of move "m" is, as well as the color given.
     *	@param m is the moved played
     *	@param color represents the side from which the move was made.
     */
    public void undoAction(Move m, int color); 

    /**
	 * toString() returns a string representation of the Board.
	 * @returns a string representation of the Board. This is in fact its own module, but will be put here for the time being.
	 */
    public String toString();

}