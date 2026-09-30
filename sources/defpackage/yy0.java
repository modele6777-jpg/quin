package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yy0 extends ls5 {
    public final /* synthetic */ int b = 2;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy0(dm9 dm9Var, v41 v41Var) {
        super(v41Var);
        this.c = dm9Var;
    }

    @Override // defpackage.ls5, defpackage.mtd
    public long c0(f41 f41Var, long j) throws Exception {
        switch (this.b) {
            case 0:
                try {
                    return super.c0(f41Var, j);
                } catch (Exception e) {
                    this.c = e;
                    throw e;
                }
            case 1:
            default:
                return super.c0(f41Var, j);
            case 2:
                try {
                    return super.c0(f41Var, j);
                } catch (IOException e2) {
                    ((dm9) this.c).e = e2;
                    throw e2;
                }
        }
    }

    @Override // defpackage.ls5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.b) {
            case 1:
                ((x71) this.c).c.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    public /* synthetic */ yy0(mtd mtdVar) {
        super(mtdVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy0(mtd mtdVar, x71 x71Var) {
        super(mtdVar);
        this.c = x71Var;
    }
}
