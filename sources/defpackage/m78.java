package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m78 {
    public static o87 a(long j, Object obj) {
        o87 o87Var = (o87) xff.h(j, obj);
        if (((x0b) o87Var).a) {
            return o87Var;
        }
        x0b x0bVar = (x0b) o87Var;
        int i = x0bVar.c;
        x0b x0bVarD = x0bVar.d(i == 0 ? 10 : i * 2);
        xff.o(j, obj, x0bVarD);
        return x0bVarD;
    }
}
