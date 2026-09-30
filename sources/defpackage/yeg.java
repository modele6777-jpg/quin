package defpackage;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.play.core.assetpacks.a;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yeg extends weg {
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yeg(a aVar, gle gleVar, int i) {
        super(aVar, gleVar);
        this.g = i;
    }

    @Override // defpackage.weg
    public void N(Bundle bundle, Bundle bundle2) {
        switch (this.g) {
            case 1:
                super.N(bundle, bundle2);
                this.e.c((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
                break;
            default:
                super.N(bundle, bundle2);
                break;
        }
    }
}
