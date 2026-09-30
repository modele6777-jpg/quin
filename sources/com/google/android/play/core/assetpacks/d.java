package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.tasks.Tasks;
import defpackage.bfg;
import defpackage.lhg;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public final bfg a;

    public d(bfg bfgVar) {
        this.a = bfgVar;
    }

    public final ParcelFileDescriptor.AutoCloseInputStream a(String str, int i, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) Tasks.a(((lhg) this.a.a()).a(str, i, str2, i2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new g("Corrupted ParcelFileDescriptor, session " + i + " packName " + str + " sliceId " + str2 + ", chunkNumber " + i2, i);
        } catch (InterruptedException e) {
            throw new g("Extractor was interrupted while waiting for chunk file.", e, i);
        } catch (ExecutionException e2) {
            throw new g("Error opening chunk file, session " + i + " packName " + str + " sliceId " + str2 + ", chunkNumber " + i2, e2, i);
        }
    }
}
