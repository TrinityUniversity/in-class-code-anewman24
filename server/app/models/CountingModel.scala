package models

// should also be thread-safe
// should be something where if you click a button --> will increase the number displayed
// use Ajax call into increments the counter and sends back a new value --> basically DON'T refresh the page

object CountingModel {
    private var count = 0;

    def getValue(): Int = {
        return count;
    }

    def increase():Unit = {
        count = count + 1
    }
}