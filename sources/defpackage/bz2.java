package defpackage;

import android.net.Uri;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lbz2;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "b", "a", "Lbz2$a;", "Lbz2$b;", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
public abstract class bz2 extends Exception {
    private static final long serialVersionUID = 4933890872862969613L;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbz2$a;", "Lbz2;", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
    public static final class a extends bz2 {
        private static final long serialVersionUID = 3516154387706407275L;
    }

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbz2$b;", "Lbz2;", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
    public static final class b extends bz2 {
        private static final long serialVersionUID = 7791142932960927332L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Uri uri, String str) {
            super("crop: Failed to load sampled bitmap: " + uri + "\r\n" + str);
            uri.getClass();
        }
    }
}
