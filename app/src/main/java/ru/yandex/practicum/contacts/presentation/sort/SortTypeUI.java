package ru.yandex.practicum.contacts.presentation.sort;

import androidx.annotation.NonNull;

import ru.yandex.practicum.contacts.presentation.base.ContactsOrderTypeUi;

public class SortTypeUI extends ContactsOrderTypeUi {



    //@Override
    public SortTypeUI (@NonNull String type, boolean isSelected) {
        super(type, isSelected);
    }


    @Override
    public String createLogMessage() {
        return "Выбран тип сортировки: " + super.getType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SortTypeUI that = (SortTypeUI) o;

        if (super.isSelected() != that.isSelected()) {
            return false;
        }
        return super.getType().equals(that.getType());
    }

    @Override
    public int hashCode() {
        int result = super.getType().hashCode();
        result = 31 * result + (super.isSelected() ? 1 : 0);
        return result;
    }
}
