package coil3.compose;

import defpackage.fy9;
import defpackage.ly4;
import defpackage.pa7;
import defpackage.yg0;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"coil3/compose/AsyncImagePainter$State$Error", "Lyg0;", "Lfy9;", "painter", "Lfy9;", "a", "()Lfy9;", "io.coil-kt.coil3:coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = z7c.f)
public final /* data */ class AsyncImagePainter$State$Error implements yg0 {
    public final ly4 a;
    private final fy9 painter;

    public AsyncImagePainter$State$Error(fy9 fy9Var, ly4 ly4Var) {
        this.painter = fy9Var;
        this.a = ly4Var;
    }

    @Override // defpackage.yg0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final fy9 getPainter() {
        return this.painter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncImagePainter$State$Error)) {
            return false;
        }
        AsyncImagePainter$State$Error asyncImagePainter$State$Error = (AsyncImagePainter$State$Error) obj;
        return pa7.t(this.painter, asyncImagePainter$State$Error.painter) && this.a.equals(asyncImagePainter$State$Error.a);
    }

    public final int hashCode() {
        fy9 fy9Var = this.painter;
        return this.a.hashCode() + ((fy9Var == null ? 0 : fy9Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.painter + ", result=" + this.a + ")";
    }
}
