var express = require('express'),
    test = express(),
    server = require('http').createServer(test),
    io = require('socket.io').listen(server);
server.listen(3000);
test.get('/', function(req, res){
  res.sendFile(__dirname + '/index.html');
});
  
    
io.sockets.on('connection', function(socket){

        var id = setInterval(function(){    
        	var date = new Date();
	        socket.emit('update', date)
        }, 1000);   

        socket.on('save', function(data){

            // var savedate = Date.parse(data);
            var savedate = new Date(data);
            // savedate  = new Date(currentdate);
            console.log(savedate);
            // console.log(id);
            clearInterval(id); 
            id = setInterval(function(){
                savedate.setSeconds(savedate.getSeconds()+1);
                //var date  = new Date(savedate);
                // console.log(date);
                io.sockets.emit('update', savedate);
                // console.log(savedate++); 
                // savedate+=1;
            }, 1000);
            // socket.emit('update', savedate);
        });

        socket.on('reset', function(data){
            clearInterval(id); 
            id = setInterval(function(){ 
            var date = new Date();
            io.sockets.emit('update', date)
        }, 1000);
        });
        


});