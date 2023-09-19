autoParts = ('brake pads', 'calipers', 'tires', 'carb', 'mass airflow sensor', 'throttle body', 'crank shaft', 'strut', 'shock', 'oil pan gasket', 'drive shaft')
print(autoParts.count) #for your ease of counting if you'd like.
print(autoParts) #all printed into a single line.

# In order, how they appear in the tuple.
for myBrokenParts in autoParts:
    print(f'Your problem is your {myBrokenParts} is broken.')

# Reversed order. 
for myBrokenParts in reversed(autoParts):
    print(f'The broken part is probably your {myBrokenParts} which will not be cheap.')