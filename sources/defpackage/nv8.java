package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nv8 {
    public final int a;
    public final int b;

    public nv8(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(q8c q8cVar) {
        q8cVar.getClass();
        if (!(q8cVar instanceof e9e)) {
            throw new wg9("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        b(((e9e) q8cVar).a);
    }

    public void b(f9e f9eVar) {
        f9eVar.getClass();
        throw new wg9("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
