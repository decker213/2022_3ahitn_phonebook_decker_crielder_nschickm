# 2022_3ahitn_phonebook_decker_crielder_nschickm

#Link zu Trello:
https://trello.com/b/zmeQ6Lt5/eckerhuberschickmair 

[Mitglieder](about_me.md) 

[Genaueres zum Programm](info.md).

{% for element in site.data.students %}
- {{element.firstname}} {{element.lastnae}}, {{element.class}}
{% endfor %}
