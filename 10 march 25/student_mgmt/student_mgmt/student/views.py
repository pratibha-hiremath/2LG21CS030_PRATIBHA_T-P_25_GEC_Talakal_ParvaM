from django.shortcuts import render

# Create your views here.
def student_form(request):
    def student_form(request):
    if request.method =='POST':
       sname =request.post['sname']
       sclass =request.POST['sclass']
       ssection=request.POST['ssection']
       sgender=request.POST['sgender'] 
       sdob=request.POST['sdob']

       Student.objects.create(sname=sname, sclass=sclass, ssection=ssection,sgender=sgender, sdob=sdob)
    return render(request, 'students/student_form.html')
    return render(request, 'students/student_form.html')