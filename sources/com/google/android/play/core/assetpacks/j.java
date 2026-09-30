package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import defpackage.bfg;
import defpackage.hfc;
import defpackage.hgg;
import defpackage.igg;
import defpackage.jgg;
import defpackage.kgg;
import defpackage.lgg;
import defpackage.lhg;
import defpackage.rfc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements lgg {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ j(k kVar, Bundle bundle, int i) {
        this.a = i;
        this.b = kVar;
        this.c = bundle;
    }

    @Override // defpackage.lgg
    public final Object a() {
        int i = this.a;
        Bundle bundle = this.c;
        k kVar = this.b;
        switch (i) {
            case 0:
                int i2 = bundle.getInt("session_id");
                if (i2 == 0) {
                    return Boolean.FALSE;
                }
                HashMap map = kVar.c;
                bfg bfgVar = kVar.e;
                Integer numValueOf = Integer.valueOf(i2);
                if (map.containsKey(numValueOf)) {
                    igg iggVar = kVar.a(i2).c;
                    String str = iggVar.a;
                    int i3 = bundle.getInt(hfc.b("status", str));
                    int i4 = iggVar.d;
                    if (rfc.g(i4, i3)) {
                        k.f.a("Found stale update for session %s with status %d.", numValueOf, Integer.valueOf(i4));
                        int i5 = iggVar.d;
                        if (i5 == 4) {
                            ((lhg) bfgVar.a()).c(i2, str);
                        } else if (i5 == 5) {
                            ((lhg) bfgVar.a()).b(i2);
                        } else if (i5 == 6) {
                            ((lhg) bfgVar.a()).d(Arrays.asList(str));
                        }
                    } else {
                        iggVar.d = i3;
                        if (i3 == 5 || i3 == 6 || i3 == 4) {
                            kVar.b(new i(kVar, i2));
                            kVar.b.a(str);
                        } else {
                            for (kgg kggVar : iggVar.f) {
                                ArrayList parcelableArrayList = bundle.getParcelableArrayList(hfc.e("chunk_intents", str, kggVar.a));
                                if (parcelableArrayList != null) {
                                    for (int i6 = 0; i6 < parcelableArrayList.size(); i6++) {
                                        if (parcelableArrayList.get(i6) != null && ((Intent) parcelableArrayList.get(i6)).getData() != null) {
                                            ((hgg) kggVar.d.get(i6)).a = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
                    if (stringArrayList == null || stringArrayList.isEmpty()) {
                        throw new g("Session without pack received.");
                    }
                    String str2 = stringArrayList.get(0);
                    long j = bundle.getLong(hfc.b("pack_version", str2));
                    String string = bundle.getString(hfc.b("pack_version_tag", str2), "");
                    int i7 = bundle.getInt(hfc.b("status", str2));
                    long j2 = bundle.getLong(hfc.b("total_bytes_to_download", str2));
                    List<String> stringArrayList2 = bundle.getStringArrayList(hfc.b("slice_ids", str2));
                    ArrayList arrayList = new ArrayList();
                    if (stringArrayList2 == null) {
                        stringArrayList2 = Collections.EMPTY_LIST;
                    }
                    for (String str3 : stringArrayList2) {
                        List parcelableArrayList2 = bundle.getParcelableArrayList(hfc.e("chunk_intents", str2, str3));
                        ArrayList arrayList2 = new ArrayList();
                        if (parcelableArrayList2 == null) {
                            parcelableArrayList2 = Collections.EMPTY_LIST;
                        }
                        Iterator it = parcelableArrayList2.iterator();
                        while (it.hasNext()) {
                            boolean z = ((Intent) it.next()) != null;
                            hgg hggVar = new hgg();
                            hggVar.a = z;
                            arrayList2.add(hggVar);
                        }
                        String string2 = bundle.getString(hfc.e("uncompressed_hash_sha256", str2, str3));
                        long j3 = bundle.getLong(hfc.e("uncompressed_size", str2, str3));
                        int i8 = bundle.getInt(hfc.e("patch_format", str2, str3), 0);
                        arrayList.add(i8 != 0 ? new kgg(str3, string2, j3, arrayList2, 0, i8) : new kgg(str3, string2, j3, arrayList2, bundle.getInt(hfc.e("compression_format", str2, str3), 0), 0));
                    }
                    kVar.c.put(Integer.valueOf(i2), new jgg(i2, bundle.getInt("app_version_code"), new igg(str2, j, i7, j2, arrayList, string)));
                }
                return Boolean.TRUE;
            default:
                int i9 = bundle.getInt("session_id");
                if (i9 == 0) {
                    return Boolean.TRUE;
                }
                HashMap map2 = kVar.c;
                Integer numValueOf2 = Integer.valueOf(i9);
                if (!map2.containsKey(numValueOf2)) {
                    return Boolean.TRUE;
                }
                jgg jggVar = (jgg) kVar.c.get(numValueOf2);
                if (jggVar.c.d == 6) {
                    return Boolean.FALSE;
                }
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("pack_names");
                if (stringArrayList3 == null || stringArrayList3.isEmpty()) {
                    throw new g("Session without pack received.");
                }
                return Boolean.valueOf(!rfc.g(jggVar.c.d, bundle.getInt(hfc.b("status", stringArrayList3.get(0)))));
        }
    }
}
