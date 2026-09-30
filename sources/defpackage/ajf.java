package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface ajf {
    static nu3 b(ajf ajfVar, Map map) {
        return ajfVar.j(map, zif.b, yif.b);
    }

    nu3 a();

    nu3 c(Collection collection, boolean z);

    void close();

    Object d(gbe gbeVar);

    nu3 e(int i);

    nu3 f(List list, zif zifVar);

    nu3 g(Map map, zif zifVar, ph2 ph2Var);

    List h(List list, int i, int i2, int i3);

    nu3 i(qh2 qh2Var, Map map);

    nu3 j(Map map, zif zifVar, ph2 ph2Var);

    nu3 k();
}
