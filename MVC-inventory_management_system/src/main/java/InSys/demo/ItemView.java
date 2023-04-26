package InSys.demo;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.impl.GridCrud;

@Route("")
@PageTitle("Inventory")

public class ItemView extends VerticalLayout {
    public ItemView(ItemService service){
        GridCrud crud = new GridCrud<Item>(Item.class,service);
        add(new H1("Inventory Management"),crud);
        setSizeFull();
    }
}
