$(document).ready(function() {
	$.ajax({
		url: "http://localhost:8080/spring-app/info/home"
	}).then(function(data) {
	  var items = [];
	  $.each( data, function( key, val ) {
		items.push("Id: "+val.id +", Name: "+val.name+"<br/>");
	  });
      $('.result').append(items);
	});
});