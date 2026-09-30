package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xyd extends h36 implements x16 {
    public static final xyd a = new xyd(0, bzd.class, "loadInitialDataCookie", "loadInitialDataCookie()Ljava/lang/String;", 1);

    @Override // defpackage.x16
    public final Object invoke() {
        Object next;
        Iterator it = ((ArrayList) jk9.a.d(rzb.b().c)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!pa7.t(((eu2) next).a, "quin-auth"));
        eu2 eu2Var = (eu2) next;
        if (eu2Var == null) {
            return null;
        }
        return ub3.j(eu2Var.a, "=", eu2Var.b);
    }
}
