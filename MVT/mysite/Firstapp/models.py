from django.db import models

# Create your models here.
class Submit(models.Model):
    name = models.CharField(max_length=100,blank=False,null=False)
    email = models.CharField(max_length=100 ,blank=False,null=False)
    phone = models.CharField(max_length=12 ,blank=False,null=False,unique=True)
    date = models.DateField()