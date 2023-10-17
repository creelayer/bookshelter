$(document).ready(function () {

    const _form = $("form");
    const _books = $("#books");

    $("#book-shelter").click(() => {
        $.ajax({
            type: "GET",
            url: _books.data("url") + "?sort=name,asc"
        }).done(e => {
            $("#books").html(e);
        });
    });


    _form.submit(function (event) {
        let formData = {
            name: $("#name").val(),
        };
        $.ajax({
            type: "POST",
            url: _form.attr("action"),
            data: formData,
        }).done(e => {
            $("form").html($(e).html());
            $("#name").val("");
        }).always(function () {
            $.ajax({
                type: "GET",
                url: _books.data("url")
            }).done(e => {
                $("#books").html(e);
            });
        });
        event.preventDefault();
    });
});