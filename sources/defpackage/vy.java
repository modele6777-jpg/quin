package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vy extends gu7 implements a26 {
    final /* synthetic */ List<cea> $placeables;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy(ArrayList arrayList) {
        super(1);
        this.$placeables = arrayList;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        bea beaVar = (bea) obj;
        List<cea> list = this.$placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            beaVar.g(list.get(i), 0, 0, 0.0f);
        }
        return wef.a;
    }
}
