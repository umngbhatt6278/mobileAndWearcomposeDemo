package com.example.livecricketdemo.model.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0003\b\u00bb\u0001\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00e9\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\'\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010=J\u0011\u0010\u00b5\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\f\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00b8\u0001\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00b9\u0001\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00ba\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0011\u0010\u00bb\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\f\u0010\u00bc\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00bd\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0011\u0010\u00be\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0011\u0010\u00bf\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\f\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00c1\u0001\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010ZJ\u0011\u0010\u00c2\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0011\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\f\u0010\u00c4\u0001\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\u0011\u0010\u00c5\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0011\u0010\u00c6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\f\u0010\u00c7\u0001\u001a\u0004\u0018\u00010 H\u00c6\u0003J\u0011\u0010\u00c8\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0011\u0010\u00c9\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\f\u0010\u00ca\u0001\u001a\u0004\u0018\u00010$H\u00c6\u0003J\u0011\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0011\u0010\u00cc\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0012\u0010\u00cd\u0001\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\'H\u00c6\u0003J\u0012\u0010\u00ce\u0001\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\'H\u00c6\u0003J\u0011\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0011\u0010\u00d0\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0011\u0010\u00d1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0012\u0010\u00d2\u0001\u001a\u0004\u0018\u00010.H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0097\u0001J\u0011\u0010\u00d3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0011\u0010\u00d4\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0011\u0010\u00d5\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0011\u0010\u00d6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0011\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0012\u0010\u00d8\u0001\u001a\u0004\u0018\u00010.H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0097\u0001J\u0012\u0010\u00d9\u0001\u001a\u0004\u0018\u00010.H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0097\u0001J\u0011\u0010\u00da\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0011\u0010\u00db\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\f\u0010\u00dc\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00dd\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00de\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00df\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u00e0\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00e1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\f\u0010\u00e2\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00e3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u0011\u0010\u00e4\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\f\u0010\u00e5\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00e6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u00f4\u0004\u0010\u00e7\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\'2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010.2\n\b\u0002\u00104\u001a\u0004\u0018\u00010.2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00e8\u0001J\u0016\u0010\u00e9\u0001\u001a\u00030\u00ea\u00012\t\u0010\u00eb\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00ec\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u00ed\u0001\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\bG\u0010?\"\u0004\bH\u0010AR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\bI\u0010?\"\u0004\bJ\u0010AR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\bK\u0010?\"\u0004\bL\u0010AR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\bM\u0010?\"\u0004\bN\u0010AR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\bO\u0010?\"\u0004\bP\u0010AR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010D\"\u0004\bR\u0010FR\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\bS\u0010?\"\u0004\bT\u0010AR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010D\"\u0004\bV\u0010FR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010D\"\u0004\bX\u0010FR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\b^\u0010Z\"\u0004\b_\u0010\\R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\b`\u0010?\"\u0004\ba\u0010AR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\bb\u0010?\"\u0004\bc\u0010AR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010D\"\u0004\be\u0010FR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\bf\u0010?\"\u0004\bg\u0010AR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\bh\u0010?\"\u0004\bi\u0010AR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\bj\u0010?\"\u0004\bk\u0010AR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010]\u001a\u0004\bl\u0010Z\"\u0004\bm\u0010\\R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\bn\u0010?\"\u0004\bo\u0010AR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\bp\u0010?\"\u0004\bq\u0010AR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\bv\u0010?\"\u0004\bw\u0010AR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\bx\u0010?\"\u0004\by\u0010AR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001e\u0010!\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010B\u001a\u0004\b~\u0010?\"\u0004\b\u007f\u0010AR \u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010B\u001a\u0005\b\u0080\u0001\u0010?\"\u0005\b\u0081\u0001\u0010AR \u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010B\u001a\u0005\b\u0086\u0001\u0010?\"\u0005\b\u0087\u0001\u0010AR&\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R&\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u0089\u0001\"\u0006\b\u008d\u0001\u0010\u008b\u0001R \u0010*\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010B\u001a\u0005\b\u008e\u0001\u0010?\"\u0005\b\u008f\u0001\u0010AR \u0010+\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010B\u001a\u0005\b\u0090\u0001\u0010?\"\u0005\b\u0091\u0001\u0010AR\u001e\u00107\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010D\"\u0005\b\u0093\u0001\u0010FR \u0010,\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010B\u001a\u0005\b\u0094\u0001\u0010?\"\u0005\b\u0095\u0001\u0010AR#\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u009a\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R \u0010/\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010B\u001a\u0005\b\u009b\u0001\u0010?\"\u0005\b\u009c\u0001\u0010AR \u00100\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010B\u001a\u0005\b\u009d\u0001\u0010?\"\u0005\b\u009e\u0001\u0010AR\u001e\u0010;\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010D\"\u0005\b\u00a0\u0001\u0010FR\u001e\u00108\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a1\u0001\u0010D\"\u0005\b\u00a2\u0001\u0010FR \u00101\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010B\u001a\u0005\b\u00a3\u0001\u0010?\"\u0005\b\u00a4\u0001\u0010AR \u00102\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010B\u001a\u0005\b\u00a5\u0001\u0010?\"\u0005\b\u00a6\u0001\u0010AR#\u00103\u001a\u0004\u0018\u00010.X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u009a\u0001\u001a\u0006\b\u00a7\u0001\u0010\u0097\u0001\"\u0006\b\u00a8\u0001\u0010\u0099\u0001R#\u00104\u001a\u0004\u0018\u00010.X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u009a\u0001\u001a\u0006\b\u00a9\u0001\u0010\u0097\u0001\"\u0006\b\u00aa\u0001\u0010\u0099\u0001R \u00105\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010B\u001a\u0005\b\u00ab\u0001\u0010?\"\u0005\b\u00ac\u0001\u0010AR \u00106\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010B\u001a\u0005\b\u00ad\u0001\u0010?\"\u0005\b\u00ae\u0001\u0010AR\u001e\u0010<\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00af\u0001\u0010D\"\u0005\b\u00b0\u0001\u0010FR\u001e\u00109\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b1\u0001\u0010D\"\u0005\b\u00b2\u0001\u0010FR\u001e\u0010:\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b3\u0001\u0010D\"\u0005\b\u00b4\u0001\u0010F\u00a8\u0006\u00ee\u0001"}, d2 = {"Lcom/example/livecricketdemo/model/response/Event;", "", "ComX", "", "ECo", "", "EO", "Eact", "Ebat", "Ecov", "Ehid", "Eid", "Epr", "Eps", "EpsL", "Esd", "", "Ese", "Esid", "Et", "EtTx", "Exd", "IncsX", "LuC", "LuUT", "LuX", "Pid", "Pids", "Lcom/example/livecricketdemo/model/response/Pids;", "SDFowX", "SDInnX", "Sids", "Lcom/example/livecricketdemo/model/response/Sids;", "Spid", "StatX", "Stg", "Lcom/example/livecricketdemo/model/response/Stg;", "SubsX", "T1", "", "Lcom/example/livecricketdemo/model/response/T1;", "T2", "TCho", "TPa", "Tr1C1", "Tr1CO1", "", "Tr1CW1", "Tr1CW2", "Tr2C1", "Tr2C2", "Tr2CO1", "Tr2CO2", "Tr2CW1", "Tr2CW2", "Tr1", "Tr2", "Trh1", "Trh2", "Tr1OR", "Tr2OR", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/example/livecricketdemo/model/response/Pids;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/example/livecricketdemo/model/response/Sids;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/example/livecricketdemo/model/response/Stg;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getComX", "()Ljava/lang/Integer;", "setComX", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getECo", "()Ljava/lang/String;", "setECo", "(Ljava/lang/String;)V", "getEO", "setEO", "getEact", "setEact", "getEbat", "setEbat", "getEcov", "setEcov", "getEhid", "setEhid", "getEid", "setEid", "getEpr", "setEpr", "getEps", "setEps", "getEpsL", "setEpsL", "getEsd", "()Ljava/lang/Long;", "setEsd", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getEse", "setEse", "getEsid", "setEsid", "getEt", "setEt", "getEtTx", "setEtTx", "getExd", "setExd", "getIncsX", "setIncsX", "getLuC", "setLuC", "getLuUT", "setLuUT", "getLuX", "setLuX", "getPid", "setPid", "getPids", "()Lcom/example/livecricketdemo/model/response/Pids;", "setPids", "(Lcom/example/livecricketdemo/model/response/Pids;)V", "getSDFowX", "setSDFowX", "getSDInnX", "setSDInnX", "getSids", "()Lcom/example/livecricketdemo/model/response/Sids;", "setSids", "(Lcom/example/livecricketdemo/model/response/Sids;)V", "getSpid", "setSpid", "getStatX", "setStatX", "getStg", "()Lcom/example/livecricketdemo/model/response/Stg;", "setStg", "(Lcom/example/livecricketdemo/model/response/Stg;)V", "getSubsX", "setSubsX", "getT1", "()Ljava/util/List;", "setT1", "(Ljava/util/List;)V", "getT2", "setT2", "getTCho", "setTCho", "getTPa", "setTPa", "getTr1", "setTr1", "getTr1C1", "setTr1C1", "getTr1CO1", "()Ljava/lang/Double;", "setTr1CO1", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getTr1CW1", "setTr1CW1", "getTr1CW2", "setTr1CW2", "getTr1OR", "setTr1OR", "getTr2", "setTr2", "getTr2C1", "setTr2C1", "getTr2C2", "setTr2C2", "getTr2CO1", "setTr2CO1", "getTr2CO2", "setTr2CO2", "getTr2CW1", "setTr2CW1", "getTr2CW2", "setTr2CW2", "getTr2OR", "setTr2OR", "getTrh1", "setTrh1", "getTrh2", "setTrh2", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/example/livecricketdemo/model/response/Pids;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/example/livecricketdemo/model/response/Sids;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/example/livecricketdemo/model/response/Stg;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/example/livecricketdemo/model/response/Event;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Event {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer ComX;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String ECo;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer EO;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Eact;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Ebat;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Ecov;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Ehid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String Eid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Epr;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String Eps;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String EpsL;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long Esd;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long Ese;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Esid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Et;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String EtTx;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Exd;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer IncsX;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer LuC;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long LuUT;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer LuX;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Pid;
    @org.jetbrains.annotations.Nullable()
    private com.example.livecricketdemo.model.response.Pids Pids;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer SDFowX;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer SDInnX;
    @org.jetbrains.annotations.Nullable()
    private com.example.livecricketdemo.model.response.Sids Sids;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Spid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer StatX;
    @org.jetbrains.annotations.Nullable()
    private com.example.livecricketdemo.model.response.Stg Stg;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer SubsX;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.example.livecricketdemo.model.response.T1> T1;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.example.livecricketdemo.model.response.T1> T2;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer TCho;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer TPa;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Tr1C1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double Tr1CO1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Tr1CW1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Tr1CW2;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Tr2C1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Tr2C2;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double Tr2CO1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double Tr2CO2;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Tr2CW1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Tr2CW2;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String Tr1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String Tr2;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String Trh1;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String Trh2;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String Tr1OR;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String Tr2OR;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.livecricketdemo.model.response.Event copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer ComX, @org.jetbrains.annotations.Nullable()
    java.lang.String ECo, @org.jetbrains.annotations.Nullable()
    java.lang.Integer EO, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Eact, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Ebat, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Ecov, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Ehid, @org.jetbrains.annotations.Nullable()
    java.lang.String Eid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Epr, @org.jetbrains.annotations.Nullable()
    java.lang.String Eps, @org.jetbrains.annotations.Nullable()
    java.lang.String EpsL, @org.jetbrains.annotations.Nullable()
    java.lang.Long Esd, @org.jetbrains.annotations.Nullable()
    java.lang.Long Ese, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Esid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Et, @org.jetbrains.annotations.Nullable()
    java.lang.String EtTx, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Exd, @org.jetbrains.annotations.Nullable()
    java.lang.Integer IncsX, @org.jetbrains.annotations.Nullable()
    java.lang.Integer LuC, @org.jetbrains.annotations.Nullable()
    java.lang.Long LuUT, @org.jetbrains.annotations.Nullable()
    java.lang.Integer LuX, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Pid, @org.jetbrains.annotations.Nullable()
    com.example.livecricketdemo.model.response.Pids Pids, @org.jetbrains.annotations.Nullable()
    java.lang.Integer SDFowX, @org.jetbrains.annotations.Nullable()
    java.lang.Integer SDInnX, @org.jetbrains.annotations.Nullable()
    com.example.livecricketdemo.model.response.Sids Sids, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Spid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer StatX, @org.jetbrains.annotations.Nullable()
    com.example.livecricketdemo.model.response.Stg Stg, @org.jetbrains.annotations.Nullable()
    java.lang.Integer SubsX, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.livecricketdemo.model.response.T1> T1, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.livecricketdemo.model.response.T1> T2, @org.jetbrains.annotations.Nullable()
    java.lang.Integer TCho, @org.jetbrains.annotations.Nullable()
    java.lang.Integer TPa, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Tr1C1, @org.jetbrains.annotations.Nullable()
    java.lang.Double Tr1CO1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Tr1CW1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Tr1CW2, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Tr2C1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Tr2C2, @org.jetbrains.annotations.Nullable()
    java.lang.Double Tr2CO1, @org.jetbrains.annotations.Nullable()
    java.lang.Double Tr2CO2, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Tr2CW1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Tr2CW2, @org.jetbrains.annotations.Nullable()
    java.lang.String Tr1, @org.jetbrains.annotations.Nullable()
    java.lang.String Tr2, @org.jetbrains.annotations.Nullable()
    java.lang.String Trh1, @org.jetbrains.annotations.Nullable()
    java.lang.String Trh2, @org.jetbrains.annotations.Nullable()
    java.lang.String Tr1OR, @org.jetbrains.annotations.Nullable()
    java.lang.String Tr2OR) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Event() {
        super();
    }
    
    public Event(@org.jetbrains.annotations.Nullable()
    java.lang.Integer ComX, @org.jetbrains.annotations.Nullable()
    java.lang.String ECo, @org.jetbrains.annotations.Nullable()
    java.lang.Integer EO, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Eact, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Ebat, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Ecov, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Ehid, @org.jetbrains.annotations.Nullable()
    java.lang.String Eid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Epr, @org.jetbrains.annotations.Nullable()
    java.lang.String Eps, @org.jetbrains.annotations.Nullable()
    java.lang.String EpsL, @org.jetbrains.annotations.Nullable()
    java.lang.Long Esd, @org.jetbrains.annotations.Nullable()
    java.lang.Long Ese, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Esid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Et, @org.jetbrains.annotations.Nullable()
    java.lang.String EtTx, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Exd, @org.jetbrains.annotations.Nullable()
    java.lang.Integer IncsX, @org.jetbrains.annotations.Nullable()
    java.lang.Integer LuC, @org.jetbrains.annotations.Nullable()
    java.lang.Long LuUT, @org.jetbrains.annotations.Nullable()
    java.lang.Integer LuX, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Pid, @org.jetbrains.annotations.Nullable()
    com.example.livecricketdemo.model.response.Pids Pids, @org.jetbrains.annotations.Nullable()
    java.lang.Integer SDFowX, @org.jetbrains.annotations.Nullable()
    java.lang.Integer SDInnX, @org.jetbrains.annotations.Nullable()
    com.example.livecricketdemo.model.response.Sids Sids, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Spid, @org.jetbrains.annotations.Nullable()
    java.lang.Integer StatX, @org.jetbrains.annotations.Nullable()
    com.example.livecricketdemo.model.response.Stg Stg, @org.jetbrains.annotations.Nullable()
    java.lang.Integer SubsX, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.livecricketdemo.model.response.T1> T1, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.livecricketdemo.model.response.T1> T2, @org.jetbrains.annotations.Nullable()
    java.lang.Integer TCho, @org.jetbrains.annotations.Nullable()
    java.lang.Integer TPa, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Tr1C1, @org.jetbrains.annotations.Nullable()
    java.lang.Double Tr1CO1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Tr1CW1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Tr1CW2, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Tr2C1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Tr2C2, @org.jetbrains.annotations.Nullable()
    java.lang.Double Tr2CO1, @org.jetbrains.annotations.Nullable()
    java.lang.Double Tr2CO2, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Tr2CW1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer Tr2CW2, @org.jetbrains.annotations.Nullable()
    java.lang.String Tr1, @org.jetbrains.annotations.Nullable()
    java.lang.String Tr2, @org.jetbrains.annotations.Nullable()
    java.lang.String Trh1, @org.jetbrains.annotations.Nullable()
    java.lang.String Trh2, @org.jetbrains.annotations.Nullable()
    java.lang.String Tr1OR, @org.jetbrains.annotations.Nullable()
    java.lang.String Tr2OR) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getComX() {
        return null;
    }
    
    public final void setComX(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getECo() {
        return null;
    }
    
    public final void setECo(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEO() {
        return null;
    }
    
    public final void setEO(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEact() {
        return null;
    }
    
    public final void setEact(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEbat() {
        return null;
    }
    
    public final void setEbat(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEcov() {
        return null;
    }
    
    public final void setEcov(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEhid() {
        return null;
    }
    
    public final void setEhid(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEid() {
        return null;
    }
    
    public final void setEid(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEpr() {
        return null;
    }
    
    public final void setEpr(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEps() {
        return null;
    }
    
    public final void setEps(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEpsL() {
        return null;
    }
    
    public final void setEpsL(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getEsd() {
        return null;
    }
    
    public final void setEsd(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getEse() {
        return null;
    }
    
    public final void setEse(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEsid() {
        return null;
    }
    
    public final void setEsid(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEt() {
        return null;
    }
    
    public final void setEt(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEtTx() {
        return null;
    }
    
    public final void setEtTx(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getExd() {
        return null;
    }
    
    public final void setExd(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIncsX() {
        return null;
    }
    
    public final void setIncsX(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLuC() {
        return null;
    }
    
    public final void setLuC(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLuUT() {
        return null;
    }
    
    public final void setLuUT(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLuX() {
        return null;
    }
    
    public final void setLuX(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPid() {
        return null;
    }
    
    public final void setPid(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.livecricketdemo.model.response.Pids component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.livecricketdemo.model.response.Pids getPids() {
        return null;
    }
    
    public final void setPids(@org.jetbrains.annotations.Nullable()
    com.example.livecricketdemo.model.response.Pids p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSDFowX() {
        return null;
    }
    
    public final void setSDFowX(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSDInnX() {
        return null;
    }
    
    public final void setSDInnX(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.livecricketdemo.model.response.Sids component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.livecricketdemo.model.response.Sids getSids() {
        return null;
    }
    
    public final void setSids(@org.jetbrains.annotations.Nullable()
    com.example.livecricketdemo.model.response.Sids p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSpid() {
        return null;
    }
    
    public final void setSpid(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStatX() {
        return null;
    }
    
    public final void setStatX(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.livecricketdemo.model.response.Stg component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.livecricketdemo.model.response.Stg getStg() {
        return null;
    }
    
    public final void setStg(@org.jetbrains.annotations.Nullable()
    com.example.livecricketdemo.model.response.Stg p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSubsX() {
        return null;
    }
    
    public final void setSubsX(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.livecricketdemo.model.response.T1> component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.livecricketdemo.model.response.T1> getT1() {
        return null;
    }
    
    public final void setT1(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.livecricketdemo.model.response.T1> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.livecricketdemo.model.response.T1> component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.livecricketdemo.model.response.T1> getT2() {
        return null;
    }
    
    public final void setT2(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.livecricketdemo.model.response.T1> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTCho() {
        return null;
    }
    
    public final void setTCho(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTPa() {
        return null;
    }
    
    public final void setTPa(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTr1C1() {
        return null;
    }
    
    public final void setTr1C1(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component36() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTr1CO1() {
        return null;
    }
    
    public final void setTr1CO1(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTr1CW1() {
        return null;
    }
    
    public final void setTr1CW1(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTr1CW2() {
        return null;
    }
    
    public final void setTr1CW2(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTr2C1() {
        return null;
    }
    
    public final void setTr2C1(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTr2C2() {
        return null;
    }
    
    public final void setTr2C2(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component41() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTr2CO1() {
        return null;
    }
    
    public final void setTr2CO1(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTr2CO2() {
        return null;
    }
    
    public final void setTr2CO2(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTr2CW1() {
        return null;
    }
    
    public final void setTr2CW1(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTr2CW2() {
        return null;
    }
    
    public final void setTr2CW2(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component45() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTr1() {
        return null;
    }
    
    public final void setTr1(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component46() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTr2() {
        return null;
    }
    
    public final void setTr2(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component47() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTrh1() {
        return null;
    }
    
    public final void setTrh1(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component48() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTrh2() {
        return null;
    }
    
    public final void setTrh2(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component49() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTr1OR() {
        return null;
    }
    
    public final void setTr1OR(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component50() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTr2OR() {
        return null;
    }
    
    public final void setTr2OR(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}