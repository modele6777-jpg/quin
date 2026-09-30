package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class idf implements xj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vad b;

    public /* synthetic */ idf(vad vadVar, int i) {
        this.a = i;
        this.b = vadVar;
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        int i = this.a;
        wef wefVar = wef.a;
        vad vadVar = this.b;
        switch (i) {
            case 0:
                if (((l77) obj) instanceof al4) {
                    vadVar.b.b = true;
                }
                break;
            default:
                iy9 iy9Var = (iy9) obj;
                boolean zBooleanValue = ((Boolean) iy9Var.a()).booleanValue();
                int iIntValue = ((Number) iy9Var.b()).intValue();
                if (!zBooleanValue) {
                    x6d x6dVar = vadVar.a;
                    e8d e8dVar = (e8d) s72.y0(iIntValue, x6dVar.c);
                    if (e8dVar != null) {
                        j35 j35Var = vadVar.b;
                        boolean z = j35Var.b && iIntValue != j35Var.a;
                        j35Var.a = iIntValue;
                        j35Var.b = false;
                        f8d f8dVar = z ? f8d.Swipe : null;
                        if (f8dVar != null) {
                            w6c.y(new b6d("button_click", bm8.L(q3c.l(x6dVar, e8dVar), bm8.H(new iy9("btn", "format_switch"), new iy9("pathway", "share_sheet"), new iy9("method", f8dVar.a())))));
                        }
                    }
                }
                break;
        }
        return wefVar;
    }
}
