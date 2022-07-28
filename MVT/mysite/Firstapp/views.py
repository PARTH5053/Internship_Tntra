from multiprocessing import context
from django.http import HttpResponseRedirect 
from django.shortcuts import redirect, render , HttpResponse
from Firstapp.models import Submit
from datetime import datetime

# Create your views here.
def index(request):
    if request.method == "POST" :
        name = request.POST.get('name')
        email = request.POST.get('email')
        phone = request.POST.get('phone')
        submit = Submit(name = name , email = email , phone = phone , date = datetime.today())
        submit.save()  
    return render(request,'index.html')

    # return render(request,'index.html')
    # return HttpResponse("This is Index page")

# def form(request):
#     return render(request,'solution.html')
def home(request):
    data = Submit.objects.all()
    return render(request,'answer.html',{'data': data})