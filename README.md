You are asked to design and implement a simple online auctioning system using Java RMI. The
auctioning system should consist of an auctioning server and client programs, as described below:
The client program(s) should enable a user to create auction items (specifying name, minimum item
value and closing date/time specified in seconds; returning unique id), and to bid against existing
auction items. Methods for listing available auction items should also be included. By the end of an
auction, the owner as well as the bidders of the item should be notified of the result (e.g., winner id,
winning bid, price not met, etc.).

The auctioning server should be able to handle a dynamically-changing set of auctions, deal with
requests from clients, and maintain the state of the various ongoing auctions. Multiple clients are
expected to be launched from machines in the network and invoke the appropriate methods on the
server. Auction information must be retained and queryable by a client application for a given time
period after the auction closes (in reality, this would be a number of days; for the purposes of testing
your program, you will need to choose an appropriate/configurable time unit).

The server should also be able to save/restore auction state to/from permanent storage. The latter feature should be used for
bootstrapping the server with some initial auction items (for system testing purposes).
You should also implement a failure detector for the server that a client can use as an “out-of-band”
keep-alive process to test whether the server is still responding, what its current load is, etc.
Your auctioning system should deal with issues arising from concurrent client access to auction items,
as well as from the implicit requirement to keep state for clients and auctions. Note that you are not
expected to provide a sophisticated user interface for any part of the system (a simple text-based
interface will suffice).


IMPORTANT: Do not assume that I will be using particular IDEs or toolsets to test your code – I will
not! You must therefore make sure your code does NOT depend on any frameworks or software other
than the JVM, and that you test your code on the School/lab Linux machines; excuses such as “it
worked at home” are not acceptable. Be explicit about any issues relating to ClassPaths etc.


