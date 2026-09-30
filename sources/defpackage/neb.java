package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class neb extends h36 implements a26 {
    final /* synthetic */ e89 $coordinates$delegate;
    final /* synthetic */ phb $layouts;
    final /* synthetic */ ufb $menu;
    final /* synthetic */ e89 $selecting$delegate;
    final /* synthetic */ qwc $selection;
    final /* synthetic */ e89 $selectionRequest$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public neb(phb phbVar, e89 e89Var, ufb ufbVar, qwc qwcVar, e89 e89Var2, e89 e89Var3) {
        super(1, oa7.class, "selectSentence", "ReadingContextMenuMarkdown$selectSentence(Lai/askquin/ui/components/ReadingTextLayouts;Landroidx/compose/runtime/MutableState;Lai/askquin/ui/components/ReadingFloatingMenu;Landroidx/compose/foundation/text/selection/SelectionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;J)V", 0);
        this.$layouts = phbVar;
        this.$coordinates$delegate = e89Var;
        this.$menu = ufbVar;
        this.$selection = qwcVar;
        this.$selectionRequest$delegate = e89Var2;
        this.$selecting$delegate = e89Var3;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        rs0.i(this.$layouts, this.$coordinates$delegate, this.$menu, this.$selection, this.$selectionRequest$delegate, this.$selecting$delegate, ((hl9) obj).a);
        return wef.a;
    }
}
