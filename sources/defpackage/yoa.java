package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface yoa extends ei7 {
    @Override // defpackage.ei7
    default Object a(kb6 kb6Var, ai7 ai7Var, Object obj, String str) {
        ArrayList arrayListN = kb6Var.n(ai7Var, obj, str);
        int size = arrayListN.size();
        List cd0Var = arrayListN;
        if (size == 1 && cd0.a(arrayListN.get(0))) {
            cd0Var = arrayListN;
            cd0Var = new cd0(arrayListN.get(0));
        }
        cd0Var = arrayListN;
        return b(obj, str, cd0Var);
    }

    Object b(Object obj, String str, List list);
}
