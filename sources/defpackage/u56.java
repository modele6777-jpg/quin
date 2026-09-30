package defpackage;

import java.io.Serializable;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u56 extends i3 implements Serializable {
    public static s56 h(ut8 ut8Var, ut8 ut8Var2, int i, x9g x9gVar, Class cls) {
        return new s56(ut8Var, Collections.EMPTY_LIST, ut8Var2, new r56(i, x9gVar, true), cls);
    }

    public static s56 i(ut8 ut8Var, Object obj, ut8 ut8Var2, int i, x9g x9gVar, Class cls) {
        return new s56(ut8Var, obj, ut8Var2, new r56(i, x9gVar, false), cls);
    }
}
