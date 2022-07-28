from turtle import forward
from django.contrib import admin
from django.urls import path , include 

urlpatterns = [
    path('admin/', admin.site.urls),
    path('',include('Firstapp.urls')),
    path('success',include('Firstapp.urls')),
    path('home',include('Firstapp.urls')),
#     path('home/',include('Firstapp.urls'))
]