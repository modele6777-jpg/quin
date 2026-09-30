package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ogg implements lhg {
    public static final rch f = new rch("FakeAssetPackService");
    public final String a;
    public final hfg b;
    public final wgg c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final bfg e;

    static {
        new AtomicInteger(1);
    }

    public ogg(File file, hfg hfgVar, Context context, wgg wggVar, bfg bfgVar) {
        this.a = file.getAbsolutePath();
        this.b = hfgVar;
        this.c = wggVar;
        this.e = bfgVar;
    }

    @Override // defpackage.lhg
    public final gfh a(String str, int i, String str2, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, str2, Integer.valueOf(i2)};
        rch rchVar = f;
        rchVar.e("getChunkFileDescriptor(session=%d, %s, %s, %d)", objArr);
        gfh gfhVar = new gfh();
        try {
            for (File file : h(str)) {
                if (eec.n(file).equals(str2)) {
                    gfhVar.p(ParcelFileDescriptor.open(file, 268435456));
                    return gfhVar;
                }
            }
            throw new id8("Local testing slice for '" + str2 + "' not found.");
        } catch (id8 e) {
            rchVar.f("getChunkFileDescriptor failed", e);
            gfhVar.r(e);
            return gfhVar;
        } catch (FileNotFoundException e2) {
            rchVar.f("getChunkFileDescriptor failed", e2);
            gfhVar.r(new id8("Asset Slice file not found.", e2));
            return gfhVar;
        }
    }

    @Override // defpackage.lhg
    public final void b(int i) {
        f.e("notifySessionFailed", new Object[0]);
    }

    @Override // defpackage.lhg
    public final void c(int i, String str) {
        f.e("notifyModuleCompleted", new Object[0]);
        ((Executor) this.e.a()).execute(new q90(this, i, str));
    }

    @Override // defpackage.lhg
    public final void d(List list) {
        f.e("cancelDownload(%s)", list);
    }

    @Override // defpackage.lhg
    public final void e(String str, int i, String str2, int i2) {
        f.e("notifyChunkTransferred", new Object[0]);
    }

    @Override // defpackage.lhg
    public final gfh f(HashMap map) {
        f.e("syncPacks()", new Object[0]);
        return Tasks.d(new ArrayList());
    }

    public final void g(int i, String str) {
        Bundle bundle = new Bundle();
        wgg wggVar = this.c;
        bundle.putInt("app_version_code", wggVar.a());
        bundle.putInt("session_id", i);
        File[] fileArrH = h(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long length = 0;
        for (File file : fileArrH) {
            length += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(null);
            String strN = eec.n(file);
            bundle.putParcelableArrayList(hfc.e("chunk_intents", str, strN), arrayList2);
            try {
                bundle.putString(hfc.e("uncompressed_hash_sha256", str, strN), aic.e(Arrays.asList(file)));
                bundle.putLong(hfc.e("uncompressed_size", str, strN), file.length());
                arrayList.add(strN);
            } catch (IOException e) {
                throw new id8(String.format("Could not digest file: %s.", file), e);
            } catch (NoSuchAlgorithmException e2) {
                throw new id8("SHA256 algorithm not supported.", e2);
            }
        }
        bundle.putStringArrayList(hfc.b("slice_ids", str), arrayList);
        bundle.putLong(hfc.b("pack_version", str), wggVar.a());
        bundle.putInt(hfc.b("status", str), 4);
        bundle.putInt(hfc.b("error_code", str), 0);
        bundle.putLong(hfc.b("bytes_downloaded", str), length);
        bundle.putLong(hfc.b("total_bytes_to_download", str), length);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", length);
        bundle.putLong("total_bytes_to_download", length);
        this.d.post(new lwg(19, this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
    }

    public final File[] h(final String str) throws id8 {
        File file = new File(this.a);
        if (!file.isDirectory()) {
            throw new id8(String.format("Local testing directory '%s' not found.", file));
        }
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: mgg
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                rch rchVar = ogg.f;
                return str2.startsWith(String.valueOf(str).concat("-")) && str2.endsWith(".apk");
            }
        });
        if (fileArrListFiles == null) {
            throw new id8(ib8.j("Failed fetching APKs for pack '", str, "'."));
        }
        if (fileArrListFiles.length == 0) {
            throw new id8(ib8.j("No APKs available for pack '", str, "'."));
        }
        for (File file2 : fileArrListFiles) {
            if (eec.n(file2).equals(str)) {
                return fileArrListFiles;
            }
        }
        throw new id8(ib8.j("No main slice available for pack '", str, "'."));
    }

    @Override // defpackage.lhg
    public final void f() {
        f.e("keepAlive", new Object[0]);
    }
}
