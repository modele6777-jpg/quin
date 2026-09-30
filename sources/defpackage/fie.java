package defpackage;

import java.util.Iterator;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fie {
    public static TarotCardType a(String str) {
        Object next;
        str.getClass();
        Iterator<E> it = TarotCardType.getEntries().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (pa7.t(((TarotCardType) next).getCardKey(), str)) {
                return (TarotCardType) next;
            }
        }
        next = null;
        return (TarotCardType) next;
    }
}
