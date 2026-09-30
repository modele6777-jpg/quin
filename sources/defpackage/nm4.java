package defpackage;

import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.draw.model.DrawCardSaves;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nm4 {
    public static DrawCardSaves a(String str, List list, List list2, List list3, MixedDeckSnapshot mixedDeckSnapshot) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        return new DrawCardSaves(str, list, list2, list3, mixedDeckSnapshot, null);
    }

    public static /* synthetic */ DrawCardSaves b(nm4 nm4Var, String str, List list, List list2, List list3) {
        nm4Var.getClass();
        return a(str, list, list2, list3, null);
    }

    public final xn7 serializer() {
        return mm4.a;
    }
}
