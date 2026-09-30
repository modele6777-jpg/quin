package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ld4 extends o2 implements RandomAccess {
    public final List a;
    public final List b;
    public final Map c;
    public final ArrayList d;

    public ld4(List list, List list2, Map map) {
        list.getClass();
        this.a = list;
        this.b = list2;
        this.c = map;
        this.d = s72.Q0(list, list2);
    }

    @Override // defpackage.d1
    public final int c() {
        return this.d.size();
    }

    @Override // defpackage.d1, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof TarotCardChoice) {
            return super.contains((TarotCardChoice) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (TarotCardChoice) this.d.get(i);
    }

    @Override // defpackage.o2, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof TarotCardChoice) {
            return super.indexOf((TarotCardChoice) obj);
        }
        return -1;
    }

    @Override // defpackage.o2, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof TarotCardChoice) {
            return super.lastIndexOf((TarotCardChoice) obj);
        }
        return -1;
    }
}
