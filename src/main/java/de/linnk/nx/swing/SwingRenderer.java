package de.linnk.nx.swing;

import javax.swing.JComponent;

public interface SwingRenderer<O> {
	public JComponent render(O o);
}
