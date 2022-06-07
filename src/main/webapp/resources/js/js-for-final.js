$('#btn').click(function(e){

    if (!$('#cccd').val() == '') {
        $('#cccderr').removeClass('text-danger').html("");
        
    } else {

        $('#cccderr').addClass('text-danger').html("truong nay bat buoc nhap");

        
    }
    
    if (!$('#hoTen').val() == '') {
        $('#hoTenerr').removeClass('text-danger').html("");
        
    } else {
    
        $('#hoTenerr').addClass('text-danger').html("truong nay bat buoc nhap");

        
    }
    
    if (!$('#ngaySinh').val() == "") {
        $('#ngaySinherr').removeClass('text-danger').html("");
       
    } else {
        $('#ngaySinherr').addClass('text-danger').html("truong nay bat buoc nhap");

        
    }
    
    if (!$('#soDienThoai').val() === "") {
        $('#soDienThoaierr').removeClass('text-danger').html("");
       
    } else {
        $('#soDienThoaierr').addClass('text-danger').html("truong nay bat buoc nhap");

        
    }
    var today = new Date().getMilliseconds();
    console.log(today)
    var ngaysinh = $('#ngaySinh').getMilliseconds();
    if(today < ngaysinh){
    $('#ngaySinherr').addClass('text-danger').html("ngay sinh phai lon hon ngay hien tai");
    }
    });