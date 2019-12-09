import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class CervejaComboBoxModel extends AbstractListModel implements ComboBoxModel  {
	private List<Cerveja> listaCervejas;
	private Cerveja cervejaSelecionada;
	
	
	public CervejaComboBoxModel() {
		this.listaCervejas =  new ArrayList<Cerveja>();
	}
	
	public void addCerveja(Cerveja cCerveja) {
		this.listaCervejas.add(cCerveja);
	}
	
	@Override
	public Object getElementAt(int index) {
		
		return this.listaCervejas.get(index);
	}

	@Override
	public int getSize() {
		
		return listaCervejas.size();
	}

	@Override
	public Object getSelectedItem() {
		return this.cervejaSelecionada;
	}

	@Override
	public void setSelectedItem(Object anItem) {
		if(anItem instanceof Cerveja) {
		this.cervejaSelecionada = (Cerveja) anItem;
		fireContentsChanged(this.listaCervejas, 0, this.listaCervejas.size());
		}
	}

}
