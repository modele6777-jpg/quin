package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.bfg;
import defpackage.egg;
import defpackage.jfg;
import defpackage.kfg;
import defpackage.lhg;
import defpackage.ofg;
import defpackage.pfg;
import defpackage.rch;
import defpackage.vfg;
import defpackage.vgg;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static final rch g = new rch("ExtractChunkTaskHandler");
    public final byte[] a = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
    public final b b;
    public final egg c;
    public final vgg d;
    public final bfg e;
    public final bfg f;

    public f(b bVar, bfg bfgVar, bfg bfgVar2, egg eggVar, vgg vggVar) {
        this.b = bVar;
        this.e = bfgVar;
        this.f = bfgVar2;
        this.c = eggVar;
        this.d = vggVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0266  */
    /* JADX WARN: Code duplicated, block: B:102:0x0269  */
    /* JADX WARN: Code duplicated, block: B:104:0x026c A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0270 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0282 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0286 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0295 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0299 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02bb A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x02d2 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x02da A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0374  */
    /* JADX WARN: Code duplicated, block: B:145:0x03d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:155:0x0385 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0302 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x024c A[EDGE_INSN: B:173:0x024c->B:96:0x024c BREAK  A[LOOP:1: B:73:0x01eb->B:176:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x01cc A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01e8 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01f3 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x0201 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0205  */
    /* JADX WARN: Code duplicated, block: B:85:0x0207 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x020f A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x022f A[Catch: all -> 0x00b3, LOOP:2: B:88:0x022d->B:89:0x022f, LOOP_END, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x023f A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0248 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0250 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:10:0x004d, B:12:0x0053, B:14:0x005f, B:19:0x006a, B:28:0x0094, B:70:0x01cc, B:72:0x01e8, B:73:0x01eb, B:75:0x01f3, B:77:0x01f7, B:82:0x0201, B:87:0x020f, B:89:0x022f, B:90:0x023b, B:85:0x0207, B:91:0x023f, B:92:0x0244, B:94:0x0248, B:96:0x024c, B:98:0x0250, B:99:0x025e, B:104:0x026c, B:106:0x0270, B:107:0x0282, B:109:0x0286, B:110:0x0295, B:112:0x0299, B:114:0x02bb, B:115:0x02be, B:121:0x02ec, B:118:0x02d2, B:119:0x02d9, B:120:0x02da, B:35:0x00a9, B:36:0x00b2, B:43:0x00bf, B:42:0x00bc, B:44:0x00c0, B:45:0x00d8, B:46:0x00d9, B:48:0x0117, B:49:0x0123, B:50:0x012c, B:51:0x012d, B:53:0x0149, B:54:0x0157, B:56:0x016a, B:57:0x016f, B:60:0x0179, B:62:0x0182, B:63:0x019c, B:64:0x01a5, B:65:0x01a6, B:66:0x01c6, B:39:0x00b7, B:20:0x0082, B:21:0x0085, B:23:0x008b), top: B:159:0x004d, outer: #4, inners: #5, #7 }] */
    public final void a(vfg vfgVar) {
        boolean z;
        InputStream sequenceInputStream;
        int i;
        String str;
        egg eggVar;
        e eVar;
        File fileI;
        pfg pfgVarB;
        boolean z2;
        File fileC;
        long length;
        File fileI2;
        boolean z3;
        String str2;
        boolean zEndsWith;
        FileOutputStream fileOutputStream;
        int i2;
        int iMin;
        int iMax;
        int i3;
        b bVar = this.b;
        String str3 = (String) vfgVar.b;
        int i4 = vfgVar.c;
        long j = vfgVar.d;
        String str4 = vfgVar.f;
        q qVar = new q(bVar, str3, i4, j, str4);
        bVar.getClass();
        File file = new File(new File(new File(bVar.c(i4, j, str3), "_slices"), "_metadata"), str4);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = vfgVar.z;
            InputStream gZIPInputStream = vfgVar.g != 1 ? autoCloseInputStream : new GZIPInputStream(autoCloseInputStream, UserMetadata.MAX_INTERNAL_KEY_SIZE);
            try {
                int i5 = 0;
                try {
                    if (vfgVar.v > 0) {
                        ofg ofgVarB = qVar.b();
                        int i6 = ofgVarB.e;
                        int i7 = vfgVar.v;
                        if (i6 != i7 - 1) {
                            throw new g("Trying to resume with chunk number " + i7 + " when previously processed chunk was number " + i6 + ".", vfgVar.a);
                        }
                        int i8 = ofgVarB.a;
                        if (i8 == 1) {
                            z = true;
                            g.a("Resuming zip entry from last chunk during file %s.", ofgVarB.b);
                            File file2 = new File(ofgVarB.b);
                            if (!file2.exists()) {
                                throw new g("Partial file specified in checkpoint does not exist. Corrupt directory.", vfgVar.a);
                            }
                            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                            randomAccessFile.seek(ofgVarB.c);
                            long j2 = ofgVarB.d;
                            do {
                                iMin = (int) Math.min(j2, 8192L);
                                iMax = Math.max(gZIPInputStream.read(this.a, 0, iMin), 0);
                                if (iMax > 0) {
                                    randomAccessFile.write(this.a, 0, iMax);
                                }
                                j2 -= (long) iMax;
                                if (j2 <= 0) {
                                    break;
                                }
                            } while (iMax > 0);
                            long length2 = randomAccessFile.length();
                            randomAccessFile.close();
                            if (iMax != iMin) {
                                g.a("Chunk has ended while resuming the previous chunks file content.", new Object[0]);
                                qVar.f(file2.getCanonicalPath(), length2, j2, vfgVar.v);
                            }
                            if (sequenceInputStream != null) {
                                eVar = new e(sequenceInputStream);
                                fileI = this.b.i(vfgVar.c, vfgVar.d, (String) vfgVar.b, vfgVar.f);
                                if (!fileI.exists()) {
                                    fileI.mkdirs();
                                }
                                do {
                                    pfgVarB = eVar.b();
                                    if (!pfgVarB.d) {
                                        if (pfgVarB.c == 0) {
                                            z3 = z;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            str2 = pfgVarB.a;
                                            if (str2 == null) {
                                                zEndsWith = false;
                                            } else {
                                                zEndsWith = str2.endsWith("/");
                                            }
                                            if (zEndsWith) {
                                                qVar.j(pfgVarB.f, eVar);
                                            } else {
                                                qVar.i(pfgVarB.f);
                                                File file3 = new File(fileI, pfgVarB.a);
                                                file3.getParentFile().mkdirs();
                                                fileOutputStream = new FileOutputStream(file3);
                                                i2 = eVar.read(this.a, 0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                                                while (i2 > 0) {
                                                    fileOutputStream.write(this.a, 0, i2);
                                                    i2 = eVar.read(this.a, 0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                                                }
                                                fileOutputStream.close();
                                            }
                                        } else {
                                            qVar.j(pfgVarB.f, eVar);
                                        }
                                    }
                                    if (!eVar.d) {
                                        break;
                                        break;
                                    }
                                } while (!eVar.e);
                                if (eVar.e) {
                                    g.a("Writing central directory metadata.", new Object[0]);
                                    qVar.j(pfgVarB.f, sequenceInputStream);
                                }
                                if (vfgVar.v + 1 == vfgVar.w) {
                                    z2 = z;
                                } else {
                                    z2 = false;
                                }
                                if (!z2) {
                                    if (pfgVarB.d) {
                                        g.a("Writing slice checkpoint for partial local file header.", new Object[0]);
                                        qVar.g(pfgVarB.f, vfgVar.v);
                                    } else if (eVar.e) {
                                        g.a("Writing slice checkpoint for central directory.", new Object[0]);
                                        qVar.e(vfgVar.v);
                                    } else {
                                        if (pfgVarB.c == 0) {
                                            g.a("Writing slice checkpoint for partial file.", new Object[0]);
                                            fileI2 = this.b.i(vfgVar.c, vfgVar.d, (String) vfgVar.b, vfgVar.f);
                                            if (!fileI2.exists()) {
                                                fileI2.mkdirs();
                                            }
                                            fileC = new File(fileI2, pfgVarB.a);
                                            length = pfgVarB.b - eVar.c;
                                            if (fileC.length() != length) {
                                                throw new g("Partial file is of unexpected size.");
                                            }
                                        } else {
                                            g.a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                            fileC = qVar.c();
                                            length = fileC.length();
                                        }
                                        qVar.f(fileC.getCanonicalPath(), length, eVar.c, vfgVar.v);
                                    }
                                }
                            }
                            gZIPInputStream.close();
                            i = vfgVar.v;
                            if (i + 1 == vfgVar.w) {
                                qVar.h(i);
                            }
                            g.e("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(vfgVar.v), vfgVar.f, (String) vfgVar.b, Integer.valueOf(vfgVar.a));
                            ((lhg) this.e.a()).e((String) vfgVar.b, vfgVar.a, vfgVar.f, vfgVar.v);
                            vfgVar.z.close();
                            if (vfgVar.y == 3) {
                                kfg kfgVar = (kfg) this.f.a();
                                str = (String) vfgVar.b;
                                long j3 = vfgVar.x;
                                eggVar = this.c;
                                synchronized (eggVar) {
                                    double d = (((double) vfgVar.v) + 1.0d) / ((double) vfgVar.w);
                                    eggVar.a.put(str, Double.valueOf(d));
                                    bs bsVar = new bs(str, 3, 0, j3, j3, (int) Math.rint(d * 100.0d), 1, vfgVar.e, this.d.a((String) vfgVar.b));
                                    kfgVar.getClass();
                                    kfgVar.b.post(new jfg(i5, kfgVar, bsVar));
                                }
                            }
                        }
                        if (i8 == 2) {
                            g.a("Resuming zip entry from last chunk during local file header.", new Object[0]);
                            b bVar2 = this.b;
                            String str5 = (String) vfgVar.b;
                            int i9 = vfgVar.c;
                            long j4 = vfgVar.d;
                            String str6 = vfgVar.f;
                            bVar2.getClass();
                            z = true;
                            File file4 = new File(new File(new File(new File(bVar2.c(i9, j4, str5), "_slices"), "_metadata"), str6), "checkpoint_ext.dat");
                            if (!file4.exists()) {
                                throw new g("Checkpoint extension file not found.", vfgVar.a);
                            }
                            sequenceInputStream = new SequenceInputStream(new FileInputStream(file4), gZIPInputStream);
                        } else {
                            if (i8 != 3) {
                                throw new g("Slice checkpoint file corrupt. Unexpected FileExtractionStatus " + i8 + ".", vfgVar.a);
                            }
                            g.a("Resuming central directory from last chunk.", new Object[0]);
                            long j5 = ofgVarB.c;
                            byte[] bArr = qVar.a;
                            RandomAccessFile randomAccessFile2 = new RandomAccessFile(qVar.c(), "rw");
                            try {
                                randomAccessFile2.seek(j5);
                                do {
                                    i3 = gZIPInputStream.read(bArr);
                                    if (i3 > 0) {
                                        randomAccessFile2.write(bArr, 0, i3);
                                    }
                                } while (i3 >= 0);
                                randomAccessFile2.close();
                                if (!(vfgVar.v + 1 == vfgVar.w)) {
                                    throw new g("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", vfgVar.a);
                                }
                                z = true;
                            } catch (Throwable th) {
                                try {
                                    randomAccessFile2.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                        if (sequenceInputStream != null) {
                            eVar = new e(sequenceInputStream);
                            fileI = this.b.i(vfgVar.c, vfgVar.d, (String) vfgVar.b, vfgVar.f);
                            if (!fileI.exists()) {
                                fileI.mkdirs();
                            }
                            do {
                                pfgVarB = eVar.b();
                                if (!pfgVarB.d && !eVar.e) {
                                    if (pfgVarB.c == 0) {
                                        z3 = z;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        qVar.j(pfgVarB.f, eVar);
                                    } else {
                                        str2 = pfgVarB.a;
                                        if (str2 == null) {
                                            zEndsWith = false;
                                        } else {
                                            zEndsWith = str2.endsWith("/");
                                        }
                                        if (zEndsWith) {
                                            qVar.i(pfgVarB.f);
                                            File file5 = new File(fileI, pfgVarB.a);
                                            file5.getParentFile().mkdirs();
                                            fileOutputStream = new FileOutputStream(file5);
                                            i2 = eVar.read(this.a, 0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                                            while (i2 > 0) {
                                                fileOutputStream.write(this.a, 0, i2);
                                                i2 = eVar.read(this.a, 0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                                            }
                                            fileOutputStream.close();
                                        } else {
                                            qVar.j(pfgVarB.f, eVar);
                                        }
                                    }
                                }
                                if (!eVar.d) {
                                    break;
                                }
                            } while (!eVar.e);
                            if (eVar.e) {
                                g.a("Writing central directory metadata.", new Object[0]);
                                qVar.j(pfgVarB.f, sequenceInputStream);
                            }
                            if (vfgVar.v + 1 == vfgVar.w) {
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                if (pfgVarB.d) {
                                    g.a("Writing slice checkpoint for partial local file header.", new Object[0]);
                                    qVar.g(pfgVarB.f, vfgVar.v);
                                } else if (eVar.e) {
                                    g.a("Writing slice checkpoint for central directory.", new Object[0]);
                                    qVar.e(vfgVar.v);
                                } else {
                                    if (pfgVarB.c == 0) {
                                        g.a("Writing slice checkpoint for partial file.", new Object[0]);
                                        fileI2 = this.b.i(vfgVar.c, vfgVar.d, (String) vfgVar.b, vfgVar.f);
                                        if (!fileI2.exists()) {
                                            fileI2.mkdirs();
                                        }
                                        fileC = new File(fileI2, pfgVarB.a);
                                        length = pfgVarB.b - eVar.c;
                                        if (fileC.length() != length) {
                                            throw new g("Partial file is of unexpected size.");
                                        }
                                    } else {
                                        g.a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                        fileC = qVar.c();
                                        length = fileC.length();
                                    }
                                    qVar.f(fileC.getCanonicalPath(), length, eVar.c, vfgVar.v);
                                }
                            }
                        }
                        gZIPInputStream.close();
                        i = vfgVar.v;
                        if (i + 1 == vfgVar.w) {
                            try {
                                qVar.h(i);
                            } catch (IOException e) {
                                g.b("Writing extraction finished checkpoint failed with %s.", e.getMessage());
                                throw new g("Writing extraction finished checkpoint failed.", e, vfgVar.a);
                            }
                        }
                        g.e("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(vfgVar.v), vfgVar.f, (String) vfgVar.b, Integer.valueOf(vfgVar.a));
                        ((lhg) this.e.a()).e((String) vfgVar.b, vfgVar.a, vfgVar.f, vfgVar.v);
                        vfgVar.z.close();
                        if (vfgVar.y == 3) {
                            kfg kfgVar2 = (kfg) this.f.a();
                            str = (String) vfgVar.b;
                            long j6 = vfgVar.x;
                            eggVar = this.c;
                            synchronized (eggVar) {
                                double d2 = (((double) vfgVar.v) + 1.0d) / ((double) vfgVar.w);
                                eggVar.a.put(str, Double.valueOf(d2));
                            }
                            bs bsVar2 = new bs(str, 3, 0, j6, j6, (int) Math.rint(d2 * 100.0d), 1, vfgVar.e, this.d.a((String) vfgVar.b));
                            kfgVar2.getClass();
                            kfgVar2.b.post(new jfg(i5, kfgVar2, bsVar2));
                        }
                        sequenceInputStream = null;
                        if (sequenceInputStream != null) {
                            eVar = new e(sequenceInputStream);
                            fileI = this.b.i(vfgVar.c, vfgVar.d, (String) vfgVar.b, vfgVar.f);
                            if (!fileI.exists()) {
                                fileI.mkdirs();
                            }
                            do {
                                pfgVarB = eVar.b();
                                if (!pfgVarB.d) {
                                    if (pfgVarB.c == 0) {
                                        z3 = z;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        qVar.j(pfgVarB.f, eVar);
                                    } else {
                                        str2 = pfgVarB.a;
                                        if (str2 == null) {
                                            zEndsWith = false;
                                        } else {
                                            zEndsWith = str2.endsWith("/");
                                        }
                                        if (zEndsWith) {
                                            qVar.i(pfgVarB.f);
                                            File file6 = new File(fileI, pfgVarB.a);
                                            file6.getParentFile().mkdirs();
                                            fileOutputStream = new FileOutputStream(file6);
                                            i2 = eVar.read(this.a, 0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                                            while (i2 > 0) {
                                                fileOutputStream.write(this.a, 0, i2);
                                                i2 = eVar.read(this.a, 0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                                            }
                                            fileOutputStream.close();
                                        } else {
                                            qVar.j(pfgVarB.f, eVar);
                                        }
                                    }
                                }
                                if (!eVar.d) {
                                    break;
                                    break;
                                }
                            } while (!eVar.e);
                            if (eVar.e) {
                                g.a("Writing central directory metadata.", new Object[0]);
                                qVar.j(pfgVarB.f, sequenceInputStream);
                            }
                            if (vfgVar.v + 1 == vfgVar.w) {
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                if (pfgVarB.d) {
                                    g.a("Writing slice checkpoint for partial local file header.", new Object[0]);
                                    qVar.g(pfgVarB.f, vfgVar.v);
                                } else if (eVar.e) {
                                    g.a("Writing slice checkpoint for central directory.", new Object[0]);
                                    qVar.e(vfgVar.v);
                                } else {
                                    if (pfgVarB.c == 0) {
                                        g.a("Writing slice checkpoint for partial file.", new Object[0]);
                                        fileI2 = this.b.i(vfgVar.c, vfgVar.d, (String) vfgVar.b, vfgVar.f);
                                        if (!fileI2.exists()) {
                                            fileI2.mkdirs();
                                        }
                                        fileC = new File(fileI2, pfgVarB.a);
                                        length = pfgVarB.b - eVar.c;
                                        if (fileC.length() != length) {
                                            throw new g("Partial file is of unexpected size.");
                                        }
                                    } else {
                                        g.a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                        fileC = qVar.c();
                                        length = fileC.length();
                                    }
                                    qVar.f(fileC.getCanonicalPath(), length, eVar.c, vfgVar.v);
                                }
                            }
                        }
                        gZIPInputStream.close();
                        i = vfgVar.v;
                        if (i + 1 == vfgVar.w) {
                            qVar.h(i);
                        }
                        g.e("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(vfgVar.v), vfgVar.f, (String) vfgVar.b, Integer.valueOf(vfgVar.a));
                        ((lhg) this.e.a()).e((String) vfgVar.b, vfgVar.a, vfgVar.f, vfgVar.v);
                        vfgVar.z.close();
                        if (vfgVar.y == 3) {
                            kfg kfgVar3 = (kfg) this.f.a();
                            str = (String) vfgVar.b;
                            long j7 = vfgVar.x;
                            eggVar = this.c;
                            synchronized (eggVar) {
                                double d3 = (((double) vfgVar.v) + 1.0d) / ((double) vfgVar.w);
                                eggVar.a.put(str, Double.valueOf(d3));
                                bs bsVar3 = new bs(str, 3, 0, j7, j7, (int) Math.rint(d3 * 100.0d), 1, vfgVar.e, this.d.a((String) vfgVar.b));
                                kfgVar3.getClass();
                                kfgVar3.b.post(new jfg(i5, kfgVar3, bsVar3));
                            }
                        }
                        g.b("IOException during extraction %s.", e.getMessage());
                        throw new g("Error extracting chunk " + vfgVar.v + " of slice " + vfgVar.f + " of pack " + ((String) vfgVar.b) + " of session " + vfgVar.a + ".", e, vfgVar.a);
                    }
                    z = true;
                    vfgVar.z.close();
                } catch (IOException unused) {
                    g.f("Could not close file for chunk %s of slice %s of pack %s.", Integer.valueOf(vfgVar.v), vfgVar.f, (String) vfgVar.b);
                }
                sequenceInputStream = gZIPInputStream;
                if (sequenceInputStream != null) {
                    eVar = new e(sequenceInputStream);
                    fileI = this.b.i(vfgVar.c, vfgVar.d, (String) vfgVar.b, vfgVar.f);
                    if (!fileI.exists()) {
                        fileI.mkdirs();
                    }
                    do {
                        pfgVarB = eVar.b();
                        if (!pfgVarB.d) {
                            if (pfgVarB.c == 0) {
                                z3 = z;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                qVar.j(pfgVarB.f, eVar);
                            } else {
                                str2 = pfgVarB.a;
                                if (str2 == null) {
                                    zEndsWith = false;
                                } else {
                                    zEndsWith = str2.endsWith("/");
                                }
                                if (zEndsWith) {
                                    qVar.i(pfgVarB.f);
                                    File file7 = new File(fileI, pfgVarB.a);
                                    file7.getParentFile().mkdirs();
                                    fileOutputStream = new FileOutputStream(file7);
                                    i2 = eVar.read(this.a, 0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                                    while (i2 > 0) {
                                        fileOutputStream.write(this.a, 0, i2);
                                        i2 = eVar.read(this.a, 0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
                                    }
                                    fileOutputStream.close();
                                } else {
                                    qVar.j(pfgVarB.f, eVar);
                                }
                            }
                        }
                        if (!eVar.d) {
                            break;
                            break;
                        }
                    } while (!eVar.e);
                    if (eVar.e) {
                        g.a("Writing central directory metadata.", new Object[0]);
                        qVar.j(pfgVarB.f, sequenceInputStream);
                    }
                    if (vfgVar.v + 1 == vfgVar.w) {
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        if (pfgVarB.d) {
                            g.a("Writing slice checkpoint for partial local file header.", new Object[0]);
                            qVar.g(pfgVarB.f, vfgVar.v);
                        } else if (eVar.e) {
                            g.a("Writing slice checkpoint for central directory.", new Object[0]);
                            qVar.e(vfgVar.v);
                        } else {
                            if (pfgVarB.c == 0) {
                                g.a("Writing slice checkpoint for partial file.", new Object[0]);
                                fileI2 = this.b.i(vfgVar.c, vfgVar.d, (String) vfgVar.b, vfgVar.f);
                                if (!fileI2.exists()) {
                                    fileI2.mkdirs();
                                }
                                fileC = new File(fileI2, pfgVarB.a);
                                length = pfgVarB.b - eVar.c;
                                if (fileC.length() != length) {
                                    throw new g("Partial file is of unexpected size.");
                                }
                            } else {
                                g.a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                fileC = qVar.c();
                                length = fileC.length();
                            }
                            qVar.f(fileC.getCanonicalPath(), length, eVar.c, vfgVar.v);
                        }
                    }
                }
                gZIPInputStream.close();
                i = vfgVar.v;
                if (i + 1 == vfgVar.w) {
                    qVar.h(i);
                }
                g.e("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(vfgVar.v), vfgVar.f, (String) vfgVar.b, Integer.valueOf(vfgVar.a));
                ((lhg) this.e.a()).e((String) vfgVar.b, vfgVar.a, vfgVar.f, vfgVar.v);
                if (vfgVar.y == 3) {
                    kfg kfgVar4 = (kfg) this.f.a();
                    str = (String) vfgVar.b;
                    long j8 = vfgVar.x;
                    eggVar = this.c;
                    synchronized (eggVar) {
                        double d4 = (((double) vfgVar.v) + 1.0d) / ((double) vfgVar.w);
                        eggVar.a.put(str, Double.valueOf(d4));
                        bs bsVar4 = new bs(str, 3, 0, j8, j8, (int) Math.rint(d4 * 100.0d), 1, vfgVar.e, this.d.a((String) vfgVar.b));
                        kfgVar4.getClass();
                        kfgVar4.b.post(new jfg(i5, kfgVar4, bsVar4));
                    }
                }
            } catch (Throwable th3) {
                try {
                    gZIPInputStream.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException e2) {
            g.b("IOException during extraction %s.", e2.getMessage());
            throw new g("Error extracting chunk " + vfgVar.v + " of slice " + vfgVar.f + " of pack " + ((String) vfgVar.b) + " of session " + vfgVar.a + ".", e2, vfgVar.a);
        }
    }
}
