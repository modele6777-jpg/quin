package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class meb extends h36 implements x16 {
    final /* synthetic */ ufb $menu;
    final /* synthetic */ e89 $selecting$delegate;
    final /* synthetic */ qwc $selection;
    final /* synthetic */ e89 $selectionRequest$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public meb(ufb ufbVar, qwc qwcVar, e89 e89Var, e89 e89Var2) {
        super(0, oa7.class, "exitSelection", "ReadingContextMenuMarkdown$exitSelection(Lai/askquin/ui/components/ReadingFloatingMenu;Landroidx/compose/foundation/text/selection/SelectionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.$menu = ufbVar;
        this.$selection = qwcVar;
        this.$selectionRequest$delegate = e89Var;
        this.$selecting$delegate = e89Var2;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        rs0.h(this.$menu, this.$selection, this.$selectionRequest$delegate, this.$selecting$delegate);
        return wef.a;
    }
}
