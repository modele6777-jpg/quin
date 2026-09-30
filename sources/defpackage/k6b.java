package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k6b extends x57 {
    @Override // defpackage.x57
    public final void D(x8c x8cVar, Object obj) {
        x6b x6bVar = (x6b) obj;
        x8cVar.getClass();
        long j = x6bVar.a;
        x8cVar.m(1, j);
        x8cVar.Q(2, x6bVar.b);
        x8cVar.m(3, x6bVar.c ? 1L : 0L);
        x8cVar.Q(4, x6bVar.d);
        x8cVar.Q(5, x6bVar.e);
        x8cVar.Q(6, x6bVar.f);
        String strM = yx4.m(x6bVar.g);
        if (strM == null) {
            x8cVar.o(7);
        } else {
            x8cVar.Q(7, strM);
        }
        x8cVar.Q(8, x6bVar.h);
        String strM2 = yx4.m(x6bVar.i);
        if (strM2 == null) {
            x8cVar.o(9);
        } else {
            x8cVar.Q(9, strM2);
        }
        x8cVar.Q(10, x6bVar.j);
        x8cVar.m(11, j);
    }

    @Override // defpackage.x57
    public final String L() {
        return "UPDATE OR ABORT `quick_decision` SET `id` = ?,`cardKey` = ?,`isReversed` = ?,`answer` = ?,`tagline` = ?,`reading` = ?,`drawnAt` = ?,`chatId` = ?,`syncedAt` = ?,`accountId` = ? WHERE `id` = ?";
    }
}
