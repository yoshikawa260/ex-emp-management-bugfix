'use strict';
$(function(){
    $('#confirmationPassword').on('keyup',function(){
        if($('#password').val() != $('#confirmationPassword').val()){
            $('#confirmationPasswordKey').text('パスワードが一致しません。').css('color', 'red');
            $('#password').css('border-color', 'red');
            $('#confirmationPassword').css('border-color', 'red');
        }else if($('#password').val() == $('#confirmationPassword').val()){
            $('#confirmationPasswordKey').text('パスワードが一致しました。').css('color', 'green');
            $('#password').css('border-color', 'green');
            $('#confirmationPassword').css('border-color', 'green');
        }
    })
})