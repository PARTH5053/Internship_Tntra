from Firstapp import views
from django.contrib import admin
from django.urls import path

urlpatterns = [
    path('admin/', admin.site.urls),
    path('',views.index,name='Firstapp'),
    # path('form',views.form,name='Firstapp'),
    path('home',views.home,name='Home'),
    # path('home/',views.home,name='Home'),
]
